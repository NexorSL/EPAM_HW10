package behavioral.strategy;

public class TrafficLight {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.changeColor();
    }
}
