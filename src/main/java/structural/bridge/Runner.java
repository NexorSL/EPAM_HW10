package structural.bridge;

public class Runner {
    public static void main(String[] args) {
        Game mario = new Mario(new Senior());

        mario.DevelopGame();
    }
}
