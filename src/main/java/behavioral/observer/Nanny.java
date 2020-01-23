package behavioral.observer;

public class Nanny implements Observer {
    private String name;

    public Nanny(String name) {
        this.name = name;
    }

    @Override
    public void check(String status) {
        System.out.println(name + ": i go to the child.");
    }
}
