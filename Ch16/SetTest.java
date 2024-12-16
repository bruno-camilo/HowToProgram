import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"red","white","blue","green","gray","orange","tan","white","cyan","peach","gray","orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);
        printNonDuplicates(list);
    }
    public static void printNonDuplicates(List<String> list){
        Set<String> set = new HashSet<>(list);

        System.out.println("%nNonduplicates are: ");
        for (String value: set){
            System.out.printf("%s", value);
            System.out.println();
        }
    }
}