package Practice_7;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> listOne = new LinkedList<>();
        LinkedList<Integer> listTwo = new LinkedList<>();

        fillLists(listOne, listTwo);

        System.out.println(listOne.toString());
        System.out.println(listTwo.toString());

        int cnt = 0;
        while (listOne.size() > 0 && listTwo.size() > 0) {
            int card1 = listOne.pop();
            int card2 = listTwo.pop();
            if (card1 > card2 || (card1==1 && card2==10)) {
                listOne.add(card1);
                listOne.add(card2);
            } else if (card2>card1 || (card2==1 && card1==10)){
                listTwo.add(card1);
                listTwo.add(card2);
            }
            cnt++;
            if (cnt==106) {
                System.out.println("botva");
                break;
            }
        }
        if(listOne.size()==0){
            System.out.println("first " + cnt);
        }else if (listTwo.size()==0){
            System.out.println("second "+ cnt);
        }

        System.out.println(listOne.toString());
        System.out.println(listTwo.toString());
    }

    private static void fillLists(LinkedList listOne, LinkedList listTwo) {
        int id;
        for (int i = 0; i < 5; i++) {
            do {
                id = (int) (Math.random() * 10);
            } while (listOne.contains(id) || listTwo.contains(id));
            listOne.add(id);
            do {
                id = (int) (Math.random() * 10);
            } while (listOne.contains(id) || listTwo.contains(id));
            listTwo.add(id);
        }
    }
}
