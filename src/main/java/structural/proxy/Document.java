package structural.proxy;

public class Document implements File {

    private String url;

    public Document(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading document from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running document " + url + "...");
    }
}
