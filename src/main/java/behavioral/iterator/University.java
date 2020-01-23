package behavioral.iterator;

public class University implements Collection {
    private String name;
    private String[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public University(String name, String[] students) {
        this.name = name;
        this.students = students;
    }

    @Override
    public Iterator getIterator() {
        return new StudentsIterator();
    }

    private class StudentsIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < students.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return students[index++];
        }
    }
}
