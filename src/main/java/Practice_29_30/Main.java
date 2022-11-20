package Practice_29_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static List<String> withStream(String str) {
        List<String> res = new ArrayList<>();

        Stream
                .of(str.split("[\\p{Punct}\\s]"))
                .collect(
                        Collectors.groupingBy(String::toLowerCase, Collectors.counting())
                )
                .entrySet()
                .stream()
                .sorted(
                        (elem1, elem2) -> {
                            if(elem1.getValue().equals(elem2.getValue())){
                                return elem1.getKey().compareTo(elem2.getKey());
                            } else{
                                return elem2.getValue().compareTo(elem1.getValue());
                            }
                        }
                )
                .limit(10)
                .forEach(elem->res.add(elem.getKey()));
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        long start = System.currentTimeMillis();
        System.out.println(withStream(str));
        System.out.println(
                "Duration with Stream API: " +
                        (System.currentTimeMillis() - start) +
                        "ms\n"
        );
    }
}