import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("red");
        items.add(0, "yellow");

        System.out.print("Display list contents with counter-controlled loop:");

        for (int i = 0; i < items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }
        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green"); // adiciona "green" ao fim da lista
        items.add("yellow"); // adiciona "yellow" ao fim da lista
        display(items, "List with two new elements:");

        items.remove("yellow"); // remove o primeiro "yellow"
        display(items, "Remove first instance of yellow:");

        items.remove(1); // remove o item no índice 1
        display(items, "Remove second list element (green):");

        // verifica se um valor está na List
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "": "not ");

         // exibe o número de elementos na List
        System.out.printf("Size: %s%n", items.size());
    }

         // exibe elementos do ArrayList no console
    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header); // exibe o cabeçalho

         // exibe cada elemento em itens
        for (String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    }
}

