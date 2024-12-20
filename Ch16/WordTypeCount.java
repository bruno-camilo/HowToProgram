import java.util.*;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        createdMap(myMap);
        displayMap(myMap);
    }
    public static void createdMap(Map<String,Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");
        for(String token: tokens){
            String word = token.toLowerCase();
            System.out.println("Word: " + word );
            if(map.containsKey(word)){
                int count = map.get(word);
                map.put(word, count + 1);
            }else
                map.put(word, 1);
        }
    }
    public static void displayMap(Map<String,Integer> map){
        Set<String> keys = map.keySet(); // obtem chaves
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");
        // gera saída de cada chave no mapa
         for (String key : sortedKeys)
             System.out.printf("%-10s%10s%n", key, map.get(key));

         System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(),map.isEmpty());
         }


}
