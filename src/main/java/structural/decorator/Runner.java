package structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Enemy enemy = new BossEnemy(new HealthEnemy(new StrongEnemy()));

        System.out.println(enemy.getPower());
    }
}
