package behavioral.visitor;

public class RepairerHighLevel implements Repairer {
    @Override
    public void repair(Cupboard cupboard) {
        System.out.println("The cupboard is repaired");
    }

    @Override
    public void repair(Chair chair) {
        System.out.println("The chair is repaired");
    }
}
