
import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"back","yellow","green", "blue","violet","silver"};
        List<String> list1 = new LinkedList<>();

        for(String color: colors)
            list1.add(color);

        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        list1.addAll(list2);
        list2 = null;
        printList(list1);

        convertToUppercaseStrings(list1); // converte em string de letras maiúsculas
        printList(list1); // imprime elementos list1
        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 6); // remove itens 4 a 6 da lista
        printList(list1); // imprime elementos list1
        printReversedList(list1);
    }

    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext())
        {
            String color = iterator.next(); // obtém o item
            iterator.set(color.toUpperCase()); // converte em letras maiúsculas
        }
    }

    public static void printList(List<String> list){
        System.out.printf("%nlist:%n");

        for (String color : list)
            System.out.printf("%s ", color);

        System.out.println();
    }
    public static void printReversedList(List<String> list){
        {
            ListIterator<String> iterator = list.listIterator(list.size());
            System.out.printf("%nReversed List:%n");

            while (iterator.hasPrevious())
                System.out.printf("%s ", iterator.previous());
    }


    }

    private static void removeItems(List<String> list, int start, int end)
    {
        list.subList(start, end).clear(); // remove os itens
    }
}
