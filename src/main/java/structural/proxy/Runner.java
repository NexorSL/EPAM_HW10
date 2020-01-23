package structural.proxy;

public class Runner {
    public static void main(String[] args) {
        File file = new ProxyFile("https://github.com/NexorSL/Document");

        file.run();
    }
}
