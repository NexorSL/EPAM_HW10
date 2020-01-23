package structural.bridge;

public class Mario extends Game {

    public Mario(Developer developer) {
        super(developer);
    }

    public void DevelopGame() {
        System.out.println("Mario game development in progress...");
        developer.writeCode();
    }
}
