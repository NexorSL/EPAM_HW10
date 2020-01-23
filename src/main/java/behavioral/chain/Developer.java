package behavioral.chain;

public interface Developer {
    void setNextDev(Developer checker);
    void writeCode();
}
