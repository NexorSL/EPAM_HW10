package behavioral.strategy;

public class GreenLight implements Activity {
    @Override
    public void changeColor() {
        System.out.println("Green color!");
    }
}
