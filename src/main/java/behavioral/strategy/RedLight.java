package behavioral.strategy;

public class RedLight implements Activity {
    @Override
    public void changeColor() {
        System.out.println("Red color!");
    }
}
