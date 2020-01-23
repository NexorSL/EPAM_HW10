package behavioral.memento;

public class Save {
    private final String name;
    private final String content;

    public Save(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
