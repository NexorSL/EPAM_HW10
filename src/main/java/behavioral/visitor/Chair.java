package behavioral.visitor;

public class Chair implements FurnitureElement {
    @Override
    public void beRepaired(Repairer repairer) {
        repairer.repair(this);
    }
}
