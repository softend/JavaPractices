package Practice_9;

public class Student implements Comparable<Practice_6.Student>{
    private int idNumber;
    private int INN;
    private String name;

    public static int test = 123;

    public Student(int idNumber, int INN, String name) {
        this.idNumber = idNumber;
        this.INN = INN;
        this.name = name;
    }

    public Student(int idNumber, int INN) {
        this.idNumber = idNumber;
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getINN() {
        return INN;
    }

    public void setINN(int INN) {
        this.INN = INN;
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
    public int compareTo(Practice_6.Student s) {
        return Integer.compare(this.idNumber, s.getIdNumber());
    }
}
