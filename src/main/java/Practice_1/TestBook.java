package Practice_1;

public class TestBook {
    public static void main(String[] args) {
        Book firstBook = new Book("Privet", 2020);
        Book secondBook = new Book("Poka", 2021);
        Book thirdBook = new Book("Vmeste");
        System.out.println(firstBook);
        secondBook.setYear(1000);
        System.out.println(secondBook.getYear());
        System.out.println(thirdBook.getAge());
    }
}