package behavioral.visitor;

public class Runner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();

        Repairer repairer = new RepairerHighLevel();

        System.out.println("High level repairer in Action...");

        furniture.beRepaired(repairer);
    }
}
