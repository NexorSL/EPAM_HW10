package structural.bridge;

public abstract class Game {
    protected Developer developer;

    public Game(Developer developer) {
        this.developer = developer;
    }
    public abstract void DevelopGame();
}
