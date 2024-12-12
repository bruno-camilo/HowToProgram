
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        Character[] letter = {'P','C','M'};
        List<Character> list = Arrays.asList(letter);
        System.out.println("list contains");
        output(list);

        Collections.reverse(list); // inverte a ordem dos elementos
        System.out.printf("%nAfter calling  reverse, list contains: %n");
        output(list);

        Character[] letterCopy = new Character[3];
        List<Character> copyList = Arrays.asList(letterCopy);
        Collections.copy(copyList, list);
        System.out.printf("%nAfter calling  copyList, list contains: %n");
        output(list);

        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling  fill, list contains: %n");
        output(list);

    }
    public static void output(List<Character> list){
        System.out.println("The list is: ");

        for(Character element : list)
            System.out.printf("%s ", element);

        System.out.printf("%nMax: %s", Collections.max(list));
        System.out.printf(" Min: %s%n", Collections.min(list));
    }
}
