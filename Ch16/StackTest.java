import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();

        stack.push(12L);
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(34567); // insere o valor int 34567ÿ
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push(1.0F); // insere o valor float 1.0Fÿ
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678); // insere o valor double 1234.5678ÿ
        System.out.println("Pushed 1234.5678 ");
        printStack(stack);
        System.out.println();
        System.out.println("Metodo no topo: "+ stack.peek());

        try{
            Number removedObject = null;
            while(true){
                removedObject = stack.pop();
                System.out.printf("Popped %s%n", removedObject);
                printStack(stack);
            }
        }catch (EmptyStackException e){
            e.printStackTrace();
        }
    }

    public static void printStack(Stack<Number> stack){
        if(stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.printf("stack contains %s (top)%n",stack);
    }
}
