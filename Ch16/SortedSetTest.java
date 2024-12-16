

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        String[] colors = {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green"};

        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
        System.out.println("sorted set:");
        printSet(tree);

        // obtém headSet com base em "orange"
        System.out.println("headSet(\"orange\"): ");
        printSet(tree.tailSet("orange"));

        // obtém tailSet baseado em "orange"
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));

        // obtém primeiro e último elementos
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last : %s%n", tree.last());

    }
    private static void printSet(SortedSet<String> set){
        for(String s: set)
            System.out.printf("%s ", s);
        System.out.println();
    }
}
