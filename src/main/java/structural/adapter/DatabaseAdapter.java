package structural.adapter;

public class DatabaseAdapter extends MyApp implements Database {

    public void create() {
        createObject();
    }

    public void select() {
        selectObject();
    }

    public void update() {
        updateObject();
    }

    public void delete() {
        deleteObject();
    }
}
