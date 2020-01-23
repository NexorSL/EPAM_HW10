package structural.decorator;

public class EnemyDecorator implements Enemy {
    Enemy enemy;

    public EnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    public String getPower() {
        return enemy.getPower();
    }
}
