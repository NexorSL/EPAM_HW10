package behavioral.command;

public class DownCommand implements Command {
    Dog dog;

    public DownCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.down();
    }
}
