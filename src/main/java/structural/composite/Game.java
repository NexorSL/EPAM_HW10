package structural.composite;

public class Game {
    public static void main(String[] args) {
        Team team = new Team();

        Developer junior = new Junior();
        Developer middle = new Middle();
        Developer senior = new Senior();

        team.addDeveloper(junior);
        team.addDeveloper(middle);
        team.addDeveloper(senior);

        team.startDevelopment();
    }
}
