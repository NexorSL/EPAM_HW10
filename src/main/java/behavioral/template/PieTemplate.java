package behavioral.template;

public abstract class PieTemplate {
    public void showRecipe(){
        System.out.println("Flour");
        showMainIngredient();
        System.out.println("Eggs");
        System.out.println("Sugar");
    }

    public abstract void showMainIngredient();
}
