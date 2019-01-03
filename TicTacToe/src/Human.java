import java.util.Scanner;

public class Human extends Player {

    public Human(String name, String marker) {
        super(name, marker);
    }

    @Override
    public String takeTurn() {
        Scanner userInput = new Scanner(System.in);

        String currentRowOrCol = "";

        //gör om currentColOrRow till rätt siffror
        System.out.print("\n\t" + name + " Vilken plats vill du lägga " + marker + " på?" +
                "\n\tSkriv in bokastav följt av en siffra: ");
        currentRowOrCol = userInput.nextLine().toLowerCase().replaceAll("\\s", "");
        return currentRowOrCol;
    }
}
