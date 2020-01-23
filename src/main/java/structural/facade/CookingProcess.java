package structural.facade;

public class CookingProcess {
    private Cook cook = new Cook();
    private Soup soup = new Soup();
    private Timer timer = new Timer();

    public void startCooking(){
        soup.doCook();
        timer.startCooking();
        cook.doCookUntilCooked(timer);
    }
}
