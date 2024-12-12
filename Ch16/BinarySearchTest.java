import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        String[] color = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(color));

        Collections.sort(list);
        System.out.printf("Sorted ArrayList: %s%n", list);

        printSearchResults(list, "black"); // primeiro item
        printSearchResults(list, "red"); // item do meio
        printSearchResults(list, "pink"); // último item
        printSearchResults(list, "aqua"); // abaixo do mais baixo
        printSearchResults(list, "gray"); // não existe
        printSearchResults(list, "teal"); //
    }

    public static void printSearchResults(List<String> list, String key){
        int result = 0;

        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);

        if(result >= 0)
            System.out.printf("Found at index %d%n", result);
        else
            System.out.printf("Not Found (%d)%n", result);

    }
}
