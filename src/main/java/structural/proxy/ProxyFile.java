package structural.proxy;

public class ProxyFile implements File{
    private String url;
    private Document document;

    public ProxyFile(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(document == null){
            document = new Document(url);
        }
        document.run();
    }
}
