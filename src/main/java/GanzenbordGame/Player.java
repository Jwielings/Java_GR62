package GanzenbordGame;

public class Player {

    private int position;
    private String name;
    private boolean skipNextTurn = false;
    private boolean isInPrison = false;
    private int turnEnteredPrison = -1;

    public int getTurnEnteredPrison() {
        return turnEnteredPrison;
    }

    public void setTurnEnteredPrison(int turnEnteredPrison) {
        this.turnEnteredPrison = turnEnteredPrison;
    }

    public Player(int position, String name) {
        this.position = position;
        this.name = name;
    }
    public Player(String name) {
        this.position = 0;
        this.name = name;
    }
    public Player(String name, boolean isInPrison) {
        this.position = 0;
        this.name = name;
        this.isInPrison = isInPrison;
    }
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public void setPosition() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isSkipNextTurn() {
        return skipNextTurn;
    }

    public void setSkipNextTurn(boolean skipNextTurn) {
        this.skipNextTurn = skipNextTurn;
    }

    public boolean isInPrison() {
        return isInPrison;
    }

    public void putInPrison(boolean inPrison) {
        isInPrison = inPrison;
    }
}

