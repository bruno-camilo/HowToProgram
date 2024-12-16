
import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties table = new Properties();

        //configura propriedades
        table.setProperty("color", "blue");
        table.setProperty("width","200");
        System.out.println("After setting properties");
        listProperties(table);

        // substitui o valor de propriedade ÿ
        table.setProperty("color", "red");

        System.out.println("After replacing properties");
        listProperties(table);

        saveProperties(table);
        table.clear(); // tabela vaziaÿ

        System.out.println("After clearing properties");
        listProperties(table);
        loadProperties(table);

        // obtém valor de cor da propriedade
        Object value = table.getProperty("color");

      // verifica se o valor está na tabela
        if (value != null)
            System.out.printf("Property color's value is %s%n", value);
        else
            System.out.println("Property color is not in table");

    }
    private static void loadProperties(Properties props) {
        try{
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input);
            input.close();
            System.out.println("After loading properties");
            listProperties(props);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    private static void saveProperties(Properties props){
        try{
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample properties");
            output.close();
            System.out.println("After saving properties");
            listProperties(props);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void  listProperties(Properties props){
        Set<Object> keys = props.keySet(); // obtém nomes de propriedadeÿ
        // gera saída de pares nome/valor
        for (Object key : keys)
             System.out.printf("%s\t%s%n", key, props.getProperty((String) key));

        System.out.println();
    }
}
