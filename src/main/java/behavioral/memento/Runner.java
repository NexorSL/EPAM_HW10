package behavioral.memento;

public class Runner {
    public static void main(String[] args) {
        Document document = new Document();
        HDD hdd = new HDD();

        System.out.println("new Doc");
        document.setNameAndContent("First Doc", "Document document = new Document();");

        hdd.setSave(document.save());

        System.out.println(document);
        document.setNameAndContent("New doc", "New content");

        System.out.println(document);
        System.out.println("Rolling back to First doc...");

        document.load(hdd.getSave());
        System.out.println(document);
    }
}
