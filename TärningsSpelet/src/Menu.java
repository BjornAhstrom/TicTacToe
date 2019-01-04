import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public Menu() {
        Scanner userInput = new Scanner(System.in);

        int choice = 0;
        boolean runnProgram = true;

        while (runnProgram) {

            System.out.println("[1] Spela Simple dice game" +
                    "\n[2] Avsluta");
            try {
                choice = userInput.nextInt();
                userInput.nextLine();
            } catch (Exception e) {
                System.out.println("Du måste svara med en siffra");
            }

            switch (choice) {
                case 1:
                    ArrayList<Player> players = initialize();
                    takeTurn(players);
                    getWinners(players);
                    break;
                case 2:
                    System.out.println("Är du säker på att du vill avsluta? J/N");
                    String answer = userInput.nextLine().toUpperCase();
                    if (answer.equals("N")) {
                        continue;
                    } else if (answer.equals("J")) {
                        System.out.println("Programmet avslutas...");
                        runnProgram = false;
                    } else {
                        System.out.println("Felaktigt svar!");
                    }
                    break;
                default:
                    System.out.println("Valet finns inte");
                    break;
            }
        }
    }

    private static ArrayList<Player> initialize() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        int numberOfPlayers = questionOne();
        int numberOfDice = questionTwo();
        int diceSides = questionThree();

        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player();
            System.out.println("Spelare " + (i + 1) + " Skriv in ditt namn ");
            //läs in namn
            player.setName(sc.nextLine());
            for (int j = 0; j < numberOfDice; j++) {
                // skapa en tärning
                Die die = new Die(diceSides);
                // lägg till tärningen till player
                player.addDie(die);
            }
            players.add(player);
        }
        return players;
    }

    public static int questionOne() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int numberOfPlayers = 0;
                System.out.println("Hur många spelare ska spela?");
                numberOfPlayers += sc.nextInt();
                if (numberOfPlayers <= 0) {
                    System.out.println("Spelet måste ha minst en spelare!\n\n");
                    continue;
                }
                return numberOfPlayers;
            } catch (Exception e) {
                System.out.println("Fel, försök igen");
                sc.nextLine();
            }
        }
    }

    public static int questionTwo() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int numberOfDice = 0;
                System.out.println("Hur många tärningar ska varje spelare ha?");
                numberOfDice += sc.nextInt();
                if (numberOfDice <= 0) {
                    System.out.println("Spelaren måste ha minst 1 tärning!\n\n");
                    continue;
                }
                return numberOfDice;
            } catch (Exception e) {
                System.out.println("Fel, Du måste använda siffror! försök igen");
                sc.nextLine();
            }
        }
    }

    public static int questionThree() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int diceSides = 0;
                System.out.println("Hur många sidor ska tärningen ha?");
                diceSides += sc.nextInt();
                sc.nextLine();
                if (diceSides <= 0) {
                    System.out.println("Tärningen måste ha minst en sida!\n\n");
                    continue;
                }
                return diceSides;
            } catch (Exception e) {
                System.out.println("Fel, försök igen");
                sc.nextLine();
            }
        }
    }

    private static void takeTurn(ArrayList<Player> players) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            for (Player player : players) {
                int guess = 0;

                while (true) {
                    try {
                        System.out.println(player.getName() + " Gissa vilket summa du kommer att få på tärningarna");
                        guess = sc.nextInt();
                        if (guess <= 0 || guess >= (player.getTotalSides() + 1)) {
                            System.out.println("Din gissning måste var mellan 1 och " + player.getTotalSides() + "\n");
                            continue;
                        }
                        player.rollDice();
                        if (guess == player.getDieValue()) {
                            player.increaseScore();
                            System.out.println("Du gissade rätt, du får 1 extra poäng!\n");
                        }
                        System.out.println(player.getName() + " ditt tärningskast blev " + player.getDieValue() + "\n" +
                                "-----------------------------------------------------------------\n");
                        break;
                    } catch (Exception e) {
                        System.out.println("Fel, försök igen");
                        sc.nextLine();
                    }
                }
            }
        }
    }
    //ArrayList<Player>
    private static void getWinners(ArrayList<Player> players) {
        //ArrayList<Player> winners = new ArrayList<>();

        result(players);
        winner(players);
        draw(players);
    }
    //ArrayList<Player>
    public static void result(ArrayList<Player> players) {
        //ArrayList<Player> result = new ArrayList<>();

        System.out.println("\n");
        System.out.println("Resultat");
        for (Player player : players) {
            System.out.println(player.getName() + " fick " + player.getScore() + " poäng!");
        }

    }

    // ArrayList<Player>
    public static void winner(ArrayList<Player> players) {
        ArrayList<Player> winner = new ArrayList<>();
        int topScore = 0;
        boolean noWinner = false;

        for (Player player : players) {
            if (player.getScore() > topScore) {
                topScore = player.getScore();
            }
        }
        System.out.println("\n");
        System.out.println("Vinnare är!");
        for (Player player : players) {
            if (player.getScore() == topScore && player.getScore() >= 1) {   //Den eller dem spelare som får högst poäng (poängen måste vara större än 0) skrivs ut som vinnare
                winner.add(player);
                System.out.println(player.getName());
            } else if (player.getScore() != topScore) {
                noWinner = true;
            }
        }
        if (noWinner) {
            System.out.println("Tyvärr, men det finns ingen vinnare!");
        }
        // return winner;
    }
    //ArrayList<Player>
    public static void draw(ArrayList<Player> players) {
        ArrayList<Player> draw = new ArrayList<>();
        int topScore = 0;

        for (Player player : players) {
            draw.add(player);
            if (player.getScore() > topScore) {
                topScore = player.getScore();
            }
        }

        System.out.println("\nDet blev oavgjort mellan ");
        for (Player player : players)
            if (draw.size() >= 2 && player.getScore() >= 1 && player.getScore() == topScore) {     //Om det är 2 eller flera vinnare, då får dem spela en omgång till
                System.out.println(player.getName());
            }
        System.out.println("ni får spela EN omgång till!\n");
        suddenDeath(players);


    }

    public static void suddenDeath(ArrayList<Player> players) {
        ArrayList<Player> win = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sides = 6;

        Die die = new Die(sides);

        for (int i = 0; i < 1; i++) {

            for (Player player : players) {
                win.add(player);
                int guess = 0;

                while (true) {
                    try {
                        System.out.println(player.getName() + " Gissa vilket summa du kommer att få på tärningarna");
                        guess = sc.nextInt();
                        if (guess <= 0 || guess >= (die.getSides() + 1)) {
                            System.out.println("Din gissning måste var mellan 1 och " + die.getSides() + "\n");
                            continue;
                        }
                        die.roll();
                        if (guess == player.getDieValue()) {
                            System.out.println("Du gissade rätt, du får 1 extra poäng!\n");
                        }
                        System.out.println(player.getName() + " ditt tärningskast blev " + player.getDieValue() + "\n" +
                                "-----------------------------------------------------------------\n");
                        break;
                    } catch (Exception e) {
                        System.out.println("Fel, försök igen");
                        sc.nextLine();
                    }
                }
            }
            sc.nextLine();
            for (Player player : players) {

                if (player.getScore() >= 1 && win.size() <= 1) {
                    System.out.println(player.getName() + " Du är en vinnare!");
                } else if (player.getScore() <= 1 && win.size() <= 1) {
                    System.out.println(player.getName() + " Du förlorade!");
                } else if (player.getScore() == 1 && win.size() >= 2) {
                    System.out.println("Det blev oavgjort!");
                }
            }
            System.out.println("Vill ni spela en omgång till? J/N");
            String answer = sc.nextLine().toUpperCase();

            if (answer.equals("J")) {
                Menu menu = new Menu();
            } else if (answer.equals("N")) {
                break;
            } else {
                System.out.println("Felaktigt svar!");
            }
        }
    }
}
