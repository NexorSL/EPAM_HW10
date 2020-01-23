package creational.prototype;

public class FileFactory {
    File file;

    public FileFactory(File file) {
        this.file = file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    File cloneFile(){
        return (File) file.clone();
    }
}
