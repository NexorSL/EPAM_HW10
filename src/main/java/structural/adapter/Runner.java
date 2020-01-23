package structural.adapter;

public class Runner {
    public static void main(String[] args) {
        Database database = new DatabaseAdapter();

        database.create();
        database.select();
        database.update();
        database.delete();
    }
}
