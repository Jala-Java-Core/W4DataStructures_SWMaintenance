package game;

public class Player {
    public int points;
    public boolean ready;
    private boolean alive;

    public Player(String name) {
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean ready() {
        return false;
    }

    public void move() {
    }

    public int points() {
        return 0;
    }

    public void pause() {
    }
}
