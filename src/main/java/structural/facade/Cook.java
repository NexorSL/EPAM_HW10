package structural.facade;

public class Cook {
    public void doCookUntilCooked(Timer timer){
        if (timer.isActiveCook()) {
            System.out.println("The cook is cooking...");
        } else {
            System.out.println("The cook is resting...");
        }
    }
}
