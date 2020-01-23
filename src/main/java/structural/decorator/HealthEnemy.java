package structural.decorator;

public class HealthEnemy extends EnemyDecorator {

    public HealthEnemy(Enemy enemy) {
        super(enemy);
    }

    public String getMoreHealth(){
        return " 50% increased maximum life.";
    }

    @Override
    public String getPower() {
        return super.getPower() + getMoreHealth();
    }
}
