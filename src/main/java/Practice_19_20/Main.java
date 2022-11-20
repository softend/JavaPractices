package Practice_19_20;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        generateNumbers(letters, arrayList, hashSet, treeSet);
        System.out.println("номер в начале "+arrayList.get(0));
        System.out.println("номер в середине "+arrayList.get(arrayList.size()/2));
        System.out.println("номер в конце "+arrayList.get(arrayList.size()-1));
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        long m = System.nanoTime();
        boolean cont = arrayList.contains(num);
        System.out.println("Линейный поиск в arrayList "+ (System.nanoTime() - m) + " нс");

        Collections.sort(arrayList);
        m = System.nanoTime();
        int a = Collections.binarySearch(arrayList, num);
        System.out.println("Бинарный поиск в arrayList "+ (System.nanoTime() - m) + " нс");

        m = System.nanoTime();
        cont = hashSet.contains(num);
        System.out.println("поиск в hashSet "+ (System.nanoTime() - m) + " нс");

        m = System.nanoTime();
        cont = treeSet.contains(num);
        System.out.println("поиск в treeSet "+ (System.nanoTime() - m) + " нс");
    }

    private static void generateNumbers(String[] letters, ArrayList<String> arrayList, HashSet<String> hashSet, TreeSet<String> treeSet) {
        int cnt = 0;
        for (int firstLetter = 0; firstLetter < 12; firstLetter++) {
            StringBuilder number = new StringBuilder();
            number.append(letters[firstLetter]);
            for (int digits = 1; digits < 1000; digits++) {
                String beaut_dig = isBeautiful(digits);
                if (beaut_dig.equals("no")) continue;
                else number.append(beaut_dig);
                for (int secLetter = 0; secLetter < 12; secLetter++) {
                    number.append(letters[secLetter]);
                    for (int thLetter = 0; thLetter < 12; thLetter++) {
                        number.append(letters[thLetter]);
                        for (int region = 1; region < 200; region++) {
                            number.append(region);

                            String str = (String.valueOf(number));
                            arrayList.add(cnt, str);
                            hashSet.add(str);
                            treeSet.add(str);
                            cnt++;
                            if (region < 10) {
                                number.deleteCharAt(number.length() - 1);
                            } else if (region < 100) {
                                number.delete(number.length() - 2, number.length());
                            } else {
                                number.delete(number.length() - 3, number.length());
                            }
                        }
                        number.deleteCharAt(number.length() - 1);
                        if (cnt > 2000000) {
                            break;
                        }
                    }
                    number.deleteCharAt(number.length() - 1);
                    if (cnt > 2000000) {
                        break;
                    }
                }
                number.delete(number.length() - 3, number.length());
                if (cnt > 2000000) {
                    break;
                }
            }
            number.deleteCharAt(number.length() - 1);
            if (cnt > 2000000) {
                break;
            }
        }
    }

    public static String isBeautiful(int x) {
        if(x==0){
            return "000";
        }
        if(x>100){
            if(String.valueOf(x).charAt(0) == String.valueOf(x).charAt(1) && String.valueOf(x).charAt(1) == String.valueOf(x).charAt(2)){
                return String.valueOf(x);
            }else{
                return "no";
            }
        }
        return "no";
    }
}
