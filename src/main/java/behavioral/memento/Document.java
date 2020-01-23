package behavioral.memento;

public class Document {
    private String name;
    private String content;

    public void setNameAndContent(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Save save(){
        return new Save(name,content);
    }

    public void load(Save save){
        name = save.getName();
        content = save.getContent();
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
