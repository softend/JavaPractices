package Practice_6;

public class Student implements Comparable<Student>{
    private int idNumber;

    public static int test = 123;
    private int GPA;

    public Student(int idNumber, int GPA) {
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.idNumber, s.getIdNumber());
    }
}
