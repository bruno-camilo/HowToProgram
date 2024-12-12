import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {
    public static void main(String[] args) {
        String[] color = {"red", "white", "yellow", "blue","red"};
        List<String> list = Arrays.asList(color);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("black");
        list2.add("red");
        list2.add("green");

        System.out.println("Before addAll, list2 contains");

        for (String element :list2)
            System.out.printf("%s ", element);

        Collections.addAll(list2,  color);

        System.out.printf("%nAfter addAll, list2 contains%n");
        for (String element: list2)
            System.out.printf("%s ", element);

        int frequency = Collections.frequency(list, "red");
        System.out.printf("%nFrequency of red in list2: %d%n", frequency);

        //verifica se list1 e list2 têm elementos em comum
        boolean disjoint = Collections.disjoint(list, list2);
        System.out.printf("list1 and list2 %s elements in common%n", (disjoint ? "do not have" : "have"));
    }
}
