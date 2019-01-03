import java.util.Scanner;

public class Game {
    private Board board;
    private Scanner userInput;
    private Player player1;
    private Player player2;

    public Game() {
        this.board = new Board();
        userInput = new Scanner(System.in);

        String playAgain = "";
        String markerRowAndColP = "";
        String markerRowAndColP2 = "";
        String winner = board.checkWinner();

        boolean tie = board.ifBoardIsFull();
        boolean startAgain = true;

        int answerEasyMediumOrDiffcultAi = 0;
        int answerHumanOrComputer = 0;
        int answerHowManyInRow = 0;
        int rowSizeIs = 0;
        int games = 0;

        System.out.println("\tVälkommen till Tic Tac Toe!");
        try {
            //sleep for 2 seconds
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
            try {
                System.out.println("\n\tVill du spela mot \n" +
                        "\n\t[1] datorn" +
                        "\n\t[2] en vän");

                answerHumanOrComputer = userInput.nextInt();

                if (answerHumanOrComputer == 1) {

                    System.out.println("\n\tVill du spela mot en " +
                            "\n\t[1] Lätt dator" +
                            "\n\t[2] Medel svår dator" +
                            "\n\t[3] Svår dator" +
                            "\n\t[4] Eller AI VS AI");

                    answerEasyMediumOrDiffcultAi = userInput.nextInt();
                    userInput.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Felaktig inmatning, svara med en siffra!");
            }

        if (answerEasyMediumOrDiffcultAi == 1) {
            createFirstPlayer();
            createSecondPlayerEasyAi();

        } else if (answerEasyMediumOrDiffcultAi == 2) {
            createFirstPlayer();
            createSecondPlayerMediumAi();

        } else if (answerEasyMediumOrDiffcultAi == 3) {
            createFirstPlayer();
            createSecondPlayerdiffucultAi();
        } else if (answerEasyMediumOrDiffcultAi == 4) {
            createFirstPlayerAi();
            createSecondPlayerdiffucultAi();

        } else if (answerHumanOrComputer == 2) {
            createFirstPlayer();
            createSecondPlayerHuman();
        }

        while (startAgain) {
            games++;
            double startTime = System.currentTimeMillis();

            board.emptyBoard();
            board.printOutBoard();


            while (winner == null && !board.ifBoardIsFull()) {

                boolean allowed = false;
                while (!allowed) {
                    markerRowAndColP = player1.takeTurn();
                    allowed = board.convertPlaceMarker(markerRowAndColP, player1.getMarker());
                }
                board.printOutBoard();

                if (board.checkWinner() != null) {
                    player1.increaseScore();
                    break;
                }

                if (board.ifBoardIsFull()) {
                    break;
                }

                allowed = false;
                while (!allowed) {
                    markerRowAndColP2 = player2.takeTurn();
                    allowed = board.convertPlaceMarker(markerRowAndColP2, player2.getMarker());
                }
                board.printOutBoard();
                if (board.checkWinner() != null) {
                    player2.increaseScore();
                    break;
                }
                if (board.ifBoardIsFull()) {
                    break;
                }
            }

            double endTime   = System.currentTimeMillis();
            double totalTime = (endTime - startTime) / 1000;

            System.out.println("\n\t" + games + " match/er spelade och det tog " + totalTime + " sekunder att Spela " +
                    "\n\t" + player1.getName() + " har just nu " + player1.getScore() +
                    "\n\t" + player2.getName() + " har just nu " + player2.getScore());

            while (true) {
                System.out.println("\n\tVill du/ni spela en omgång till? J/N");

                playAgain = userInput.nextLine().toUpperCase().replaceAll("\\s", "");

                if (playAgain.equals("J")) {
                    break;
                } else if (playAgain.equals("N")) {
                    startAgain = false;
                    System.out.println("Programmet avslutas...");
                    break;
                } else {
                    System.out.println("Du måste svara med J eller N");
                }
            }
        }
    }

    private void createFirstPlayer() {
        String marker;
        userInput.nextLine();
        System.out.print("\n\tSpelare 1 Skriv in ditt namn: ");
        String name = userInput.nextLine();

        while (true) {
            System.out.print("\n\tVill du vara X eller O? ");
            marker = userInput.nextLine().toUpperCase().replaceAll("\\s", "");
            if (marker.equals("X") || marker.equals("O")) {
                break;
            } else {
                System.out.println("\n\tDu måste välja X eller O...");
            }
        }
        player1 = new Human(name, marker);
    }

    //Skapar spelare 1 som AI
    public void createFirstPlayerAi() {
        String marker = "X";

        player1 = new EasyAi("Dum Ai", marker);
        System.out.println("\n\t" + player1.getName() + " är " + player1.getMarker());
    }

    //Skapar den andra användaren, människa
    public void createSecondPlayerHuman() {

        System.out.print("\n\tSpelare 2 Skriv in ditt namn: ");
        String name = userInput.nextLine();

        String marker;
        if (player1.getMarker().equals("X")) {
            marker = "O";
        } else {
            marker = "X";
        }

        player2 = new Human(name, marker);
        System.out.println("\n\t" + player2.getName() + " Du får vara " + player2.getMarker());
    }

    //Skapar den andra användaren, Lätt ai
    public void createSecondPlayerEasyAi() {
        String marker;
        if (player1.getMarker().equals("X")) {
            marker = "O";
        } else {
            marker = "X";
        }

        player2 = new EasyAi("Dator", marker);
        System.out.println("\n\t" + player2.getName() + " är " + player2.getMarker());
    }

    //Skapar den andra användaren, Medel ai
    public void createSecondPlayerMediumAi() {
        String marker;
        if (player1.getMarker().equals("X")) {
            marker = "O";
        } else {
            marker = "X";
        }

        player2 = new Ai("Lite smartare Ai", marker, board, player1.getMarker());
        System.out.println("\n\t" + player2.getName() + " är " + player2.getMarker());
    }

    //Skapar den andra användaren, Svår ai
    public void createSecondPlayerdiffucultAi() {
        String marker;
        if (player1.getMarker().equals("X")) {
            marker = "O";
        } else {
            marker = "X";
        }

        player2 = new DifficultAi("Smartare Ai", marker, board, player1.getMarker());
        System.out.println("\n\t" + player2.getName() + " är " + player2.getMarker());
    }
}