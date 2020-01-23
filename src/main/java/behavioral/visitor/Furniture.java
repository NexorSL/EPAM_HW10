package behavioral.visitor;

public class Furniture implements FurnitureElement {
    private FurnitureElement[] furnitureElements;

    public Furniture() {
        this.furnitureElements = new FurnitureElement[]{
                new Chair(),
                new Cupboard()
        };
    }

    @Override
    public void beRepaired(Repairer repairer) {
        for(FurnitureElement element: furnitureElements){
            element.beRepaired(repairer);
        }
    }
}
