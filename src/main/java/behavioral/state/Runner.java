package behavioral.state;

public class Runner {
    public static void main(String[] args) {
        Activity activity = new RedLight();
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.setActivity(activity);

        for (int i = 0; i < 5; i++){
            trafficLight.change();
            trafficLight.changeLight();
        }
    }
}
