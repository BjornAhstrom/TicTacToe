import java.util.Scanner;

public class Menu {

    public Menu() {
        Scanner userInput = new Scanner(System.in);



        int answer = 0;
        boolean runnProgram = true;

        while (runnProgram) {

            System.out.println("\tVälkommen till Tic Tac Toe");
            try {
                //sleep for 2 seconds
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }


            System.out.println("\n\t[1] Spela tre i rad" +
                    "\n\t[2] Bestäm din egna storlek på spelet" +
                    "\n\t[3] Avsluta");
            System.out.print("\t");

            answer = userInput.nextInt();
            userInput.nextLine();

            switch (answer) {
                case 1:
                    int ans = 0;
                    System.out.println("\n\t[1] 2 Spelare" +
                            "\n\t[2] Spela mot datorn");

                    System.out.print("\t");
                    ans = userInput.nextInt();
                    userInput.nextLine();

                    switch (ans) {
                        case 1:
                            //Game game = new Game();
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("\tValet finns inte");
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("\n\tProgrammet avslutas");
                    runnProgram = false;
                    break;
                default:
                    System.out.println("\n\tValet finns inte, försök igen");
                    break;
            }
        }
    }
}
