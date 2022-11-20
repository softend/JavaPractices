package Practice_6;

import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGPA(), o2.getGPA());
    }

    public void quickSort(List<Student> list, int low, int high) {
        if (list.size() == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = list.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (compare(list.get(i), opora) < 0) {
                i++;
            }

            while (compare(list.get(j), opora) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(list, low, j);

        if (high > i)
            quickSort(list, i, high);
    }
}