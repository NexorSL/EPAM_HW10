package behavioral.visitor;

public class Cupboard implements FurnitureElement {
    @Override
    public void beRepaired(Repairer repairer) {
        repairer.repair(this);
    }
}
