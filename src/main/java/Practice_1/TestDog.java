package Practice_1;

public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.getHumanAge();
        d2.getHumanAge();
        d3.getHumanAge();
    }
}