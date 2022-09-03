package Practice_1;

public class Book {
    String name;
    int year;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public int getAge(){
        return 2022-year;
    }
}
