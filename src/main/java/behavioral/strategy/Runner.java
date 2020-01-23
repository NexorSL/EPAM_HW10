package behavioral.strategy;

public class Runner {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.setActivity(new GreenLight());
        trafficLight.executeActivity();

        trafficLight.setActivity(new YellowLight());
        trafficLight.executeActivity();

        trafficLight.setActivity(new RedLight());
        trafficLight.executeActivity();
    }
}
