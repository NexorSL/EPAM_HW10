package structural.facade;

public class Timer {
    private boolean activeCook;

    public boolean isActiveCook(){
        return activeCook;
    }

    public void startCooking(){
        System.out.println("Cooking is active");
        activeCook = true;
    }

    public void finishCooking(){
        System.out.println("Cooking is not active");
        activeCook = false;
    }
}
