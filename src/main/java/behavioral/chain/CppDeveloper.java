package behavioral.chain;

public class CppDeveloper implements Developer {
    private Developer developer;

    @Override
    public void setNextDev(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void writeCode() {
        if(developer == null){
            System.out.println(msg());
        } else {
            System.out.println(developer);
        }
    }

    private String msg(){
        return "Cpp Developer writes code...";
    }

    @Override
    public String toString() {
        return msg();
    }
}
