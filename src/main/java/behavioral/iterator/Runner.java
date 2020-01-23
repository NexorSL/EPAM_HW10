package behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        String[] students = {"Oleg", "Ivan", "Anya", "Maxim"};

        University university = new University("NTUDP", students);
        Iterator iterator = university.getIterator();
        System.out.println("University: " + university.getName());
        System.out.println("Students: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
