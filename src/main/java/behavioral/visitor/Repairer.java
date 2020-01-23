package behavioral.visitor;

public interface Repairer {
    void repair(Cupboard cupboard);

    void repair(Chair chair);
}
