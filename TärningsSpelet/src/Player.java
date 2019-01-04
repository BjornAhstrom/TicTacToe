import java.util.ArrayList;

public class Player {

    private String name;
    private int score;
    private ArrayList<Die> listOfDice;

    public Player() {
        //this.name = name;
        listOfDice = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {

        return score;
    }

    public void rollDice() {
        for (int i = 0; i < listOfDice.size(); i++) {
            listOfDice.get(i).roll();
        }
    }

    public int getTotalSides() {
        int sum = 0;

        for (int i = 0; i < listOfDice.size(); i++) {
            sum += listOfDice.get(i).getSides();
        }

        return sum;

    }


    public int getDieValue() {
        int sum = 0;

        for (int i = 0; i < listOfDice.size(); i++) {
            sum += listOfDice.get(i).getCurrentValue();
        }

        return sum;
    }

    public void addDie(Die die) {
        listOfDice.add(die);
    }


    public void increaseScore() {
        score++;
    }


}
