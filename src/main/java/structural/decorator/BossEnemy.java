package structural.decorator;

public class BossEnemy extends EnemyDecorator {

    public BossEnemy(Enemy enemy) {
        super(enemy);
    }

    public String getMoreDamage(){
        return " 100% increased damage.";
    }

    @Override
    public String getPower() {
        return super.getPower() + getMoreDamage();
    }
}
