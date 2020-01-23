package behavioral.chain;

public class Runner {
    public static void main(String[] args) {
        Developer developer = new CppDeveloper();

        developer.writeCode();
        developer.setNextDev(new JavaDeveloper());
        developer.writeCode();
    }
}
