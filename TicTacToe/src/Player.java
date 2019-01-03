public abstract class Player {

    protected String name;
    protected String marker;
    protected int score;

    public Player(String name, String marker) {
        this.name = name;
        this.marker = marker;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void increaseScore() {
        score++;
    }

    public abstract String takeTurn();

}
