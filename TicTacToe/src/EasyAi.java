import java.util.Random;

public class EasyAi extends Player {

    public EasyAi(String name, String marker) {
        super(name, marker);
    }

    @Override
    public String takeTurn() {
        Random random = new Random();

        String sendString = "";
        //String currentLetter = "";
        // String currentNumber = "";

        int row = random.nextInt(3);
        int col = random.nextInt(3) + 1;

        int currentNumber = row + 97;

        char currentChar = (char) currentNumber;

        String currentRow = Character.toString(currentChar);
        String currentCol = Integer.toString(col);

        sendString = currentRow + currentCol;

//        if (row == 0) {
//            currentLetter = "a";
//        }
//
//        if (row == 1) {
//            currentLetter = "b";
//        }
//
//        if (row == 2) {
//            currentLetter = "c";
//        }
//
//        if (col == 0) {
//            currentNumber = "1";
//        }
//
//        if (col == 1) {
//            currentNumber = "2";
//        }
//
//        if (col == 2) {
//            currentNumber = "3";
//        }

        //System.out.print("\n\t" + name + " lägger " + marker + " på " + currentLetter + currentNumber);

        try {
            //sleep for 1 seconds
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        return sendString;
    }
}
