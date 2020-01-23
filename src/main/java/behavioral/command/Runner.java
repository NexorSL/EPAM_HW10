package behavioral.command;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Owner owner = new Owner(
                new SitCommand(dog),
                new StandCommand(dog),
                new DownCommand(dog)
        );

        owner.commandSit();
        owner.commandStand();
        owner.commandDown();
    }
}
