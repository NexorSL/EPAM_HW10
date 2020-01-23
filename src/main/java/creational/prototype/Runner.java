package creational.prototype;

public class Runner {
    public static void main(String[] args) {
        File main = new File(1,"Main file");

        System.out.println(main);

        FileFactory factory = new FileFactory(main);
        File mainClone = factory.cloneFile();

        System.out.println(mainClone);
    }
}
