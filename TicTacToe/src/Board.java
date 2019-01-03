public class Board {
    private String[][] board;
    private int enlargeBoard;

    //Konstruktor
    public Board() {
        this.enlargeBoard = 3;
        board = new String[getEnlargeBoard()][getEnlargeBoard()];
        emptyBoard();
    }

    public void setEnlargeBoard(int enlargeBoard) {
        this.enlargeBoard = enlargeBoard;
    }

    public int getEnlargeBoard() {
        return enlargeBoard;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    //tömmer brädet
    public void emptyBoard() {
        for (int row = 0; row < getEnlargeBoard(); row++) {

            for (int col = 0; col < getEnlargeBoard(); col++) {
                board[row][col] = " ";
            }
        }
    }

    //Kollar om brädet är fullt, om det är fullt och skriver ut att det blev oavgjort
    public boolean ifBoardIsFull() {

        for (int row = 0; row < getEnlargeBoard(); row++) {
            for (int col = 0; col < getEnlargeBoard(); col++) {
                if (board[row][col].equals(" ")) {
                    return false;
                }
            }
        }
        System.out.println("Det blev oavgjort!");
        return true;
    }

    //Skapar ett tomt bräde med bokstäver upptill och siffror på vänster sida
    public void printOutBoard() {
        char letter = 97;

        System.out.print("\n\t\t   ");
        for (int col = 0; col < getEnlargeBoard(); col++) {
            System.out.print((letter) + "   ");
            letter++;
        }
        System.out.println("\n\t\t -------------");

        for (int row = 0; row < getEnlargeBoard(); row++) {
            System.out.print("\t" + (row + 1));
            System.out.print("\t" + " | ");

            for (int col = 0; col < getEnlargeBoard(); col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("\t\t -------------");
        }
        System.out.println("\n");
    }

    //Konvertera om en sträng till siffror och delar på siffrorna och tilldelar row en siffra och col den andra
    public boolean convertPlaceMarker(String currentRowOrCol, String marker) {
        int row = 0;
        int col = 0;

        String currentLetter = "";

        currentLetter = currentRowOrCol.substring(0, 1);
        int currentIntNumber = currentLetter.charAt(0);
        col = currentIntNumber - 97;

//        if (currentRowOrCol.substring(0, 1).equals("a")) {
//            col = 0;
//        }
//
//        if (currentRowOrCol.substring(0, 1).equals("b")) {
//            col = 1;
//        }
//
//        if (currentRowOrCol.substring(0, 1).equals("c")) {
//            col = 2;
//        }

        row = Integer.parseInt(currentRowOrCol.substring(1, 2)) - 1;

        if (board[row][col].equals("X") || board[row][col].equals("O")) {
            // System.out.println("\tUpptagen plats, försök igen");
            return false;
        } else {
            board[row][col] = marker;
        }
        return true;
    }

    //Tar emot 4 metodrar och kollar om det finns en vinnare
    public String checkWinner() {

        String winner = checkAllRows();
        if (winner != null)
            return winner;

        winner = checkAllColumns();
        if (winner != null)
            return winner;

        winner = checkDiagonalOne();
        if (winner != null)
            return winner;

        winner = checkDiagonalTwo();
        if (winner != null)
            return winner;

        return null;
    }

    //kollar om det finns en vinnare på någon vågrät rad
    public String checkAllRows() {

        for (int row = 0; row < getEnlargeBoard(); row++) {
            boolean winner = true;

            for (int col = 1; col < getEnlargeBoard(); col++) {
                if (board[row][col].equals(" ") || !board[row][0].equals(board[row][col]))
                    winner = false;
            }
            if (winner) {
                System.out.println("\n\t" + board[row][0] + " är vinnare");
                return board[row][0];
            }
        }
        return null;
    }

    //kollar om det finns en vinnare på någon lodrät rad
    public String checkAllColumns() {
        for (int col = 0; col < getEnlargeBoard(); col++) {
            boolean winner = true;

            for (int row = 1; row < getEnlargeBoard(); row++) {
                if (board[row][col].equals(" ") || !board[0][col].equals(board[row][col]))
                    winner = false;
            }
            if (winner) {
                System.out.println("\n\t" + board[0][col] + " är vinnare");
                return board[0][col];
            }
        }
        return null;
    }

    //kollar om det finns en vinnare på diagonalen startar på ruta 1 mitten 5 och sist 9
    public String checkDiagonalOne() {
        boolean winner = true;

                if (board[0][0].equals(" ") || !board[0][0].equals(board[1][1]) || !board[0][0].equals(board[2][2])) {//|| !board[0][0].equals(board[2][2])) {
                    winner = false;
                }

                if (winner) {
                    System.out.println("\n\t" + board[0][0] + " är vinnare");
                    return board[0][0];
                }
        return null;
    }

    //kollar om det finns en vinnare på diagonalen startar på ruta 7 mitten 5 och sist 3
    public String checkDiagonalTwo() {
        boolean winner = true;

        if (board[2][0].equals(" ") || !board[2][0].equals(board[1][1]) || !board[2][0].equals(board[0][2])) {
            winner = false;
        }

        if (winner) {
            System.out.println("\n\t" + board[2][0] + " är vinnare");
            return board[2][0];
        }
        return null;
    }
}
