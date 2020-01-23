package behavioral.state;

public class TrafficLight {
    Activity activity;
    Activity prevActivity;

    public void setActivity(Activity activity) {
        if(activity != null){
            this.prevActivity = this.activity;
        }
        this.activity = activity;
    }

    public void changeLight(){
        if(activity instanceof RedLight){
            setActivity(new YellowLight());
        } else if(activity instanceof YellowLight && prevActivity instanceof RedLight){
            setActivity(new GreenLight());
        } else if(activity instanceof GreenLight){
            setActivity(new YellowLight());
        } else if(activity instanceof YellowLight && prevActivity instanceof GreenLight){
            setActivity(new RedLight());
        }
    }

    public void change(){
        activity.changeColor();
    }
}
