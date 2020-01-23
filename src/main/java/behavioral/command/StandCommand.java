package behavioral.command;

public class StandCommand implements Command {
    Dog dog;

    public StandCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        System.out.println("Dog is standing");
    }
}
