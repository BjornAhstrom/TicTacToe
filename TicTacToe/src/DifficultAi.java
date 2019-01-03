public class DifficultAi extends Player {
    private Board board;
    private String player1Marker;

    public DifficultAi(String name, String marker, Board board, String player1Marker) {
        super(name, marker);
        this.board = board;
        this.player1Marker = player1Marker;

    }

    @Override
    public String getMarker() {
        return super.getMarker();
    }

    @Override
    public String takeTurn() {
        String currentPlaceMarker = "";

        //Check row1, Check two in row and put marker to win
        if ((board.getBoard()[0][0].equals(board.getBoard()[0][1])) && (board.getBoard()[0][2].equals(" ")) && board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "c1";
        } else if ((board.getBoard()[0][2].equals(board.getBoard()[0][1])) && (board.getBoard()[0][0].equals(" ")) && board.getBoard()[0][2].equals(getMarker()) && !board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "a1";
        } else if ((board.getBoard()[0][0].equals(board.getBoard()[0][2])) && (board.getBoard()[0][1].equals(" ")) && board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "b1";
        }

        //Check row2, Check two in row and put marker to win
        if ((board.getBoard()[1][0].equals(board.getBoard()[1][1])) && (board.getBoard()[1][2].equals(" ")) && board.getBoard()[1][0].equals(getMarker()) && !board.getBoard()[1][0].equals(" ")) {
            return currentPlaceMarker = "c2";
        } else if ((board.getBoard()[1][2].equals(board.getBoard()[1][1])) && (board.getBoard()[1][0].equals(" ")) && board.getBoard()[1][2].equals(getMarker()) && !board.getBoard()[1][2].equals(" ")) {
            return currentPlaceMarker = "a2";
        } else if ((board.getBoard()[1][0].equals(board.getBoard()[1][2])) && (board.getBoard()[1][1].equals(" ")) && board.getBoard()[1][0].equals(getMarker()) && !board.getBoard()[1][0].equals(" ")) {
            return currentPlaceMarker = "b2";
        }

        //Check row3, Check two in row and put marker to win
        if ((board.getBoard()[2][0].equals(board.getBoard()[2][1])) && (board.getBoard()[2][2].equals(" ")) && board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "c3";
        } else if ((board.getBoard()[2][2].equals(board.getBoard()[2][1])) && (board.getBoard()[2][0].equals(" ")) && board.getBoard()[2][2].equals(getMarker()) && !board.getBoard()[2][2].equals(" ")) {
            return currentPlaceMarker = "a3";
        } else if ((board.getBoard()[2][0].equals(board.getBoard()[2][2])) && (board.getBoard()[2][1].equals(" ")) && board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "b3";
        }

        //Check column1, Check two in row and put marker to win
        if ((board.getBoard()[0][0].equals(board.getBoard()[1][0])) && (board.getBoard()[2][0].equals(" ")) && board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "a3";
        } else if ((board.getBoard()[2][0].equals(board.getBoard()[1][0])) && (board.getBoard()[0][0].equals(" ")) && board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "a1";
        } else if ((board.getBoard()[0][0].equals(board.getBoard()[2][0])) && (board.getBoard()[1][0].equals(" ")) && board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "a2";
        }

        //Check column2, Check two in row and put marker to win
        if ((board.getBoard()[0][1].equals(board.getBoard()[1][1])) && (board.getBoard()[2][1].equals(" ")) && board.getBoard()[0][1].equals(getMarker()) && !board.getBoard()[0][1].equals(" ")) {
            return currentPlaceMarker = "b3";
        } else if ((board.getBoard()[2][1].equals(board.getBoard()[1][1])) && (board.getBoard()[0][1].equals(" ")) && board.getBoard()[2][1].equals(getMarker()) && !board.getBoard()[2][1].equals(" ")) {
            return currentPlaceMarker = "b1";
        } else if ((board.getBoard()[0][1].equals(board.getBoard()[2][1])) && (board.getBoard()[1][1].equals(" ")) && board.getBoard()[0][1].equals(getMarker()) && !board.getBoard()[0][1].equals(" ")) {
            return currentPlaceMarker = "b2";
        }

        //Check column3, Check two in row and put marker to win
        if ((board.getBoard()[0][2].equals(board.getBoard()[1][2])) && (board.getBoard()[2][2].equals(" ")) && board.getBoard()[0][2].equals(getMarker()) && !board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "c3";
        } else if ((board.getBoard()[2][2].equals(board.getBoard()[1][2])) && (board.getBoard()[0][2].equals(" ")) && board.getBoard()[2][2].equals(getMarker()) && !board.getBoard()[2][2].equals(" ")) {
            return currentPlaceMarker = "c1";
        } else if ((board.getBoard()[0][2].equals(board.getBoard()[2][2])) && (board.getBoard()[1][2].equals(" ")) && board.getBoard()[0][2].equals(getMarker()) && !board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "c2";
        }

        //Check diagonal top left to bottom right, Check two in row and put marker to win
        if ((board.getBoard()[0][0].equals(board.getBoard()[1][1])) && (board.getBoard()[2][2].equals(" ")) && board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "c3";
        } else if ((board.getBoard()[2][2].equals(board.getBoard()[1][1])) && (board.getBoard()[0][0].equals(" ")) && board.getBoard()[2][2].equals(getMarker()) && !board.getBoard()[2][2].equals(" ")) {
            return currentPlaceMarker = "a1";
        } else if ((board.getBoard()[0][0].equals(board.getBoard()[2][2])) && (board.getBoard()[1][1].equals(" ")) && board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "b2";
        }

        //Check diagonal bottom left to top right, Check two in row and put marker to win
        if ((board.getBoard()[2][0].equals(board.getBoard()[1][1])) && (board.getBoard()[0][2].equals(" ")) && board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "c1";
        } else if ((board.getBoard()[0][2].equals(board.getBoard()[1][1])) && (board.getBoard()[2][0].equals(" ")) && board.getBoard()[0][2].equals(getMarker()) && !board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "a3";
        } else if ((board.getBoard()[2][0].equals(board.getBoard()[0][2])) && (board.getBoard()[1][1].equals(" ")) && board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "b2";
        }

        //Check row1, Ai try to block opponents
        if ((board.getBoard()[0][0].equals(board.getBoard()[0][1])) && (board.getBoard()[0][2].equals(" ")) && !board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "c1";
        } else if ((board.getBoard()[0][2].equals(board.getBoard()[0][1])) && (board.getBoard()[0][0].equals(" ")) && !board.getBoard()[0][2].equals(getMarker()) && !board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "a1";
        } else if ((board.getBoard()[0][0].equals(board.getBoard()[0][2])) && (board.getBoard()[0][1].equals(" ")) && !board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "b1";
        }

        //Check row2, Ai try to block opponents
        if ((board.getBoard()[1][0].equals(board.getBoard()[1][1])) && (board.getBoard()[1][2].equals(" ")) && !board.getBoard()[1][0].equals(getMarker()) && !board.getBoard()[1][0].equals(" ")) {
            return currentPlaceMarker = "c2";
        } else if ((board.getBoard()[1][2].equals(board.getBoard()[1][1])) && (board.getBoard()[1][0].equals(" ")) && !board.getBoard()[1][2].equals(getMarker()) && !board.getBoard()[1][2].equals(" ")) {
            return currentPlaceMarker = "a2";
        } else if ((board.getBoard()[1][0].equals(board.getBoard()[1][2])) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[1][0].equals(getMarker()) && !board.getBoard()[1][0].equals(" ")) {
            return currentPlaceMarker = "b2";
        }

        //Check row3, Ai try to block opponents
        if ((board.getBoard()[2][0].equals(board.getBoard()[2][1])) && (board.getBoard()[2][2].equals(" ")) && !board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "c3";
        } else if ((board.getBoard()[2][2].equals(board.getBoard()[2][1])) && (board.getBoard()[2][0].equals(" ")) && !board.getBoard()[2][2].equals(getMarker()) && !board.getBoard()[2][2].equals(" ")) {
            return currentPlaceMarker = "a3";
        } else if ((board.getBoard()[2][0].equals(board.getBoard()[2][2])) && (board.getBoard()[2][1].equals(" ")) && !board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "b3";
        }

        //Check column1, Ai try to block opponents
        if ((board.getBoard()[0][0].equals(board.getBoard()[1][0])) && (board.getBoard()[2][0].equals(" ")) && !board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "a3";
        } else if ((board.getBoard()[2][0].equals(board.getBoard()[1][0])) && (board.getBoard()[0][0].equals(" ")) && !board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "a1";
        } else if ((board.getBoard()[0][0].equals(board.getBoard()[2][0])) && (board.getBoard()[1][0].equals(" ")) && !board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "a2";
        }

        //Check column2, Ai try to block opponents
        if ((board.getBoard()[0][1].equals(board.getBoard()[1][1])) && (board.getBoard()[2][1].equals(" ")) && !board.getBoard()[0][1].equals(getMarker()) && !board.getBoard()[0][1].equals(" ")) {
            return currentPlaceMarker = "b3";
        } else if ((board.getBoard()[2][1].equals(board.getBoard()[1][1])) && (board.getBoard()[0][1].equals(" ")) && !board.getBoard()[2][1].equals(getMarker()) && !board.getBoard()[2][1].equals(" ")) {
            return currentPlaceMarker = "b1";
        } else if ((board.getBoard()[0][1].equals(board.getBoard()[2][1])) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[0][1].equals(getMarker()) && !board.getBoard()[0][1].equals(" ")) {
            return currentPlaceMarker = "b2";
        }

        //Check column3, Ai try to block opponents
        if ((board.getBoard()[0][2].equals(board.getBoard()[1][2])) && (board.getBoard()[2][2].equals(" ")) && !board.getBoard()[0][2].equals(getMarker()) && !board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "c3";
        } else if ((board.getBoard()[2][2].equals(board.getBoard()[1][2])) && (board.getBoard()[0][2].equals(" ")) && !board.getBoard()[2][2].equals(getMarker()) && !board.getBoard()[2][2].equals(" ")) {
            return currentPlaceMarker = "c1";
        } else if ((board.getBoard()[0][2].equals(board.getBoard()[2][2])) && (board.getBoard()[1][2].equals(" ")) && !board.getBoard()[0][2].equals(getMarker()) && !board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "c2";
        }

        //Check diagonal top left to bottom right, Ai try to block opponents
        if ((board.getBoard()[0][0].equals(board.getBoard()[1][1])) && (board.getBoard()[2][2].equals(" ")) && !board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "c3";
        } else if ((board.getBoard()[2][2].equals(board.getBoard()[1][1])) && (board.getBoard()[0][0].equals(" ")) && !board.getBoard()[2][2].equals(getMarker()) && !board.getBoard()[2][2].equals(" ")) {
            return currentPlaceMarker = "a1";
        } else if ((board.getBoard()[0][0].equals(board.getBoard()[2][2])) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[0][0].equals(getMarker()) && !board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "b2";
        }

        //Check diagonal bottom left to top right, Ai try to block opponents
        if ((board.getBoard()[2][0].equals(board.getBoard()[1][1])) && (board.getBoard()[0][2].equals(" ")) && !board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "c1";
        } else if ((board.getBoard()[0][2].equals(board.getBoard()[1][1])) && (board.getBoard()[2][0].equals(" ")) && !board.getBoard()[0][2].equals(getMarker()) && !board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "a3";
        } else if ((board.getBoard()[2][0].equals(board.getBoard()[0][2])) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[2][0].equals(getMarker()) && !board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "b2";
        }

        //Check row 1, Ai try to take win position
        if ((board.getBoard()[0][0].equals(getMarker()) && (board.getBoard()[0][1].equals(" ")) && !board.getBoard()[0][0].equals(" ")) && !board.getBoard()[0][2].equals(player1Marker)) {
            return currentPlaceMarker = "b1";
        } else if ((board.getBoard()[0][2].equals(getMarker()) && (board.getBoard()[0][1].equals(" ")) && !board.getBoard()[0][2].equals(" ")) && !board.getBoard()[0][0].equals(player1Marker)) {
            return currentPlaceMarker = "b1";
        } else if ((board.getBoard()[0][1].equals(getMarker()) && (board.getBoard()[0][0].equals(" ")) && !board.getBoard()[0][0].equals(" ")) && !board.getBoard()[0][2].equals(player1Marker)) {
            return currentPlaceMarker = "a1";
        }

        //Check row2, Ai try to take win position
        if ((board.getBoard()[1][0].equals(getMarker()) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[1][0].equals(" ")) && !board.getBoard()[1][2].equals(player1Marker)) {
            return currentPlaceMarker = "b2";
        } else if ((board.getBoard()[1][2].equals(getMarker()) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[1][2].equals(" ")) && !board.getBoard()[1][0].equals(player1Marker)) {
            return currentPlaceMarker = "b2";
        } else if ((board.getBoard()[1][1].equals(getMarker()) && (board.getBoard()[1][0].equals(" ")) && !board.getBoard()[1][0].equals(" ")) && !board.getBoard()[1][0].equals(player1Marker)) {
            return currentPlaceMarker = "a2";
        }

        //Check row3, Ai try to take win position
        if ((board.getBoard()[2][0].equals(getMarker()) && (board.getBoard()[2][1].equals(" ")) && !board.getBoard()[2][0].equals(" ")) && !board.getBoard()[2][0].equals(player1Marker)) {
            return currentPlaceMarker = "b3";
        } else if ((board.getBoard()[2][2].equals(getMarker()) && (board.getBoard()[2][1].equals(" ")) && !board.getBoard()[2][2].equals(" ")) && !board.getBoard()[2][0].equals(player1Marker)) {
            return currentPlaceMarker = "b3";
        } else if ((board.getBoard()[2][1].equals(getMarker()) && (board.getBoard()[2][0].equals(" ")) && !board.getBoard()[2][0].equals(" ")) && !board.getBoard()[2][2].equals(player1Marker)) {
            return currentPlaceMarker = "a3";
        }

        //Check column1, Ai try to take win position
        if ((board.getBoard()[0][0].equals(getMarker()) && (board.getBoard()[1][0].equals(" ")) && !board.getBoard()[0][0].equals(" ")) && !board.getBoard()[2][2].equals(player1Marker)) {
            return currentPlaceMarker = "a2";
        } else if ((board.getBoard()[2][0].equals(getMarker()) && (board.getBoard()[1][0].equals(" ")) && !board.getBoard()[2][0].equals(" ")) && !board.getBoard()[0][0].equals(player1Marker)) {
            return currentPlaceMarker = "a2";
        } else if ((board.getBoard()[1][0].equals(getMarker()) && (board.getBoard()[0][0].equals(" ")) && !board.getBoard()[0][0].equals(" ")) && !board.getBoard()[2][0].equals(player1Marker)) {
            return currentPlaceMarker = "a1";
        }

        //Check column2, Ai try to take win position
        if ((board.getBoard()[0][1].equals(getMarker()) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[0][1].equals(" ")) && !board.getBoard()[2][1].equals(player1Marker)) {
            return currentPlaceMarker = "b2";
        } else if ((board.getBoard()[2][1].equals(getMarker()) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[2][1].equals(" ")) && !board.getBoard()[0][1].equals(player1Marker)) {
            return currentPlaceMarker = "b2";
        } else if ((board.getBoard()[1][1].equals(getMarker()) && (board.getBoard()[0][1].equals(" ")) && !board.getBoard()[0][1].equals(" ")) && !board.getBoard()[2][1].equals(player1Marker)) {
            return currentPlaceMarker = "b1";
        }

        //Check column3, Ai try to take win position
        if ((board.getBoard()[0][2].equals(getMarker()) && (board.getBoard()[1][2].equals(" ")) && !board.getBoard()[0][2].equals(" ")) && !board.getBoard()[2][2].equals(player1Marker)) {
            return currentPlaceMarker = "c2";
        } else if ((board.getBoard()[2][2].equals(getMarker()) && (board.getBoard()[1][2].equals(" ")) && !board.getBoard()[2][2].equals(" ")) && !board.getBoard()[0][2].equals(player1Marker)) {
            return currentPlaceMarker = "c2";
        } else if ((board.getBoard()[1][2].equals(getMarker()) && (board.getBoard()[0][2].equals(" ")) && !board.getBoard()[0][2].equals(" ")) && !board.getBoard()[2][2].equals(player1Marker)) {
            return currentPlaceMarker = "c1";
        }

        //Check diagonal top left to bottom right, Ai try to take win position
        if ((board.getBoard()[0][0].equals(getMarker()) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[0][0].equals(" ")) && !board.getBoard()[2][2].equals(player1Marker)) {
            return currentPlaceMarker = "b2";
        } else if ((board.getBoard()[2][2].equals(getMarker()) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[2][2].equals(" ")) && !board.getBoard()[0][0].equals(player1Marker)) {
            return currentPlaceMarker = "b2";
        } else if ((board.getBoard()[1][1].equals(getMarker()) && (board.getBoard()[0][0].equals(" ")) && !board.getBoard()[0][0].equals(" ")) && !board.getBoard()[2][2].equals(player1Marker)) {
            return currentPlaceMarker = "a1";
        }

        //Check diagonal bottom left to top right, Ai try to take win position
        if ((board.getBoard()[2][0].equals(getMarker()) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[2][0].equals(" ")) && !board.getBoard()[0][2].equals(player1Marker)) {
            return currentPlaceMarker = "b2";
        } else if ((board.getBoard()[0][2].equals(getMarker()) && (board.getBoard()[1][1].equals(" ")) && !board.getBoard()[0][2].equals(" ")) && !board.getBoard()[2][0].equals(player1Marker)) {
            return currentPlaceMarker = "b2";
        } else if ((board.getBoard()[1][1].equals(getMarker()) && (board.getBoard()[0][2].equals(" ")) && !board.getBoard()[2][0].equals(" ")) && !board.getBoard()[2][0].equals(player1Marker)) {
            return currentPlaceMarker = "c1";
        }

        if (board.getBoard()[0][0].equals(getMarker()) || board.getBoard()[0][2].equals(getMarker()) || board.getBoard()[2][0].equals(getMarker()) || board.getBoard()[2][2].equals(getMarker())) {
            return currentPlaceMarker = "b1";
        }

        if (board.getBoard()[1][1].equals(" ")) {
            return currentPlaceMarker = "b2";
        } else if (board.getBoard()[0][0].equals(" ")) {
            return currentPlaceMarker = "a1";
        } else if (board.getBoard()[0][2].equals(" ")) {
            return currentPlaceMarker = "c1";
        } else if (board.getBoard()[2][0].equals(" ")) {
            return currentPlaceMarker = "a3";
        } else if (board.getBoard()[2][2].equals(" ")) {
            return currentPlaceMarker = "c3";
        }


        return null;
    }
}
