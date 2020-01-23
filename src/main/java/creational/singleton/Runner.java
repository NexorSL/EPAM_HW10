package creational.singleton;

public class Runner {
    public static void main(String[] args) {
        GlobalCounter.getGlobalCounter().increaseCounter();
        GlobalCounter.getGlobalCounter().showValue();
        GlobalCounter.getGlobalCounter().increaseCounter();
        GlobalCounter.getGlobalCounter().showValue();
    }
}
