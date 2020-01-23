package behavioral.template;

public class Runner {
    public static void main(String[] args) {
        PieTemplate cherryPie = new CherryPie();
        PieTemplate applePie = new ApplePie();

        cherryPie.showRecipe();

        System.out.println("\n======================\n");

        applePie.showRecipe();
    }
}
