package behavioral.observer;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Child child = new Child();

        Observer ann = new Nanny("Ann");
        Observer max = new Nanny("Max");

        child.addObserver(ann);
        child.addObserver(max);

        child.childCry();

        child.removeObserver(max);

        Thread.sleep(2500);
        child.childCry();
    }
}
