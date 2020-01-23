package creational.singleton;

public class GlobalCounter {
    private static GlobalCounter globalCounter;
    private static long counter = 0L;

    public static GlobalCounter getGlobalCounter(){
        if(globalCounter == null){
            globalCounter = new GlobalCounter();
        }

        return globalCounter;
    }
    private GlobalCounter(){}

    public void increaseCounter(){
        counter++;
    }
    public void showValue(){
        System.out.println(counter);
    }
}
