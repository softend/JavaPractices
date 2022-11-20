package Practice_1;

public class Dog {
    String name;
    int age;
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Dog(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getHumanAge(){
        System.out.println(age*7+" years");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
