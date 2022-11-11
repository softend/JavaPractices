package Practice_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<Student>(0);
        fillList(list);
        printId(list);

//        sortId(list); – задание 1

//        SortingStudentsByGPA sort = new SortingStudentsByGPA();
//        sort.quickSort(list, 0, list.size()-1); - задание 2



        System.out.println("Sorted: ");
        printId(list);

        System.out.println(Student.test);
    }

    private static void sortId(List list) {
        for (int i = 2; i < list.size(); i++){
            Student student = ((Student) list.get(i));
            int j = i-1;
            while (j>=0 && ((Student) list.get(j)).compareTo(student) != -1){
                list.set(j+1,(list.get(j)));
                j--;
            }
            list.set(j+1,student);
        }
    }

    private static void fillList(List list) {
        int id,GPA;
        for(int i=0; i<10; i++){
            do{
                id = 1+(int)(Math.random()*20);
                GPA = id;
            }while (isIn(id, list));
            list.add(new Student(id, GPA));
        }
    }

    private static void printId(List list) {
        for (int i = 0; i< list.size(); i++){
            System.out.println(((Student) list.get(i)).getIdNumber());
        }
    }

    private static boolean isIn(int id, List list) {
        for(int i=0; i<list.size();i++){
            if (((Student)list.get(i)).getIdNumber()==id){
                return true;
            }
        }
        return false;
    }
}
