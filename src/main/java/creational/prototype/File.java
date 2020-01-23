package creational.prototype;

public class File implements Copyable {
    private int id;
    private String content;

    public File(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object clone() {
        File copy = new File(id, content);
        return copy;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
