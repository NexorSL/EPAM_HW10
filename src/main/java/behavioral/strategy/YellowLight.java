package behavioral.strategy;

public class YellowLight implements Activity {
    @Override
    public void changeColor() {
        System.out.println("Yellow color!");
    }
}
