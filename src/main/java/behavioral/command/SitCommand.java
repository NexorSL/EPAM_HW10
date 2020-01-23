package behavioral.command;

public class SitCommand implements Command {
    Dog dog;

    public SitCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.sit();
    }
}
