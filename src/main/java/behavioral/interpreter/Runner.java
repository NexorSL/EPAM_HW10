package behavioral.interpreter;

public class Runner {
    public static void main(String[] args) {
        Expression isLang = getLanguageExpression();

        System.out.println("Do you speak English: " + isLang.interpet("English"));
        System.out.println("Do you speak Russian: " + isLang.interpet("Russian"));
    }

    public static Expression getLanguageExpression(){
        Expression english = new TerminalExpression("English");
        Expression russian = new TerminalExpression("Russian");

        return new OrExpression(english, russian);
    }
}
