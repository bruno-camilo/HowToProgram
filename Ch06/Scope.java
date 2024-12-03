public class Scope{
	public static int x = 1;

	public static void main(String[] args){

		int x = 5;
		System.out.printf("local x in main is %d%n", x);

		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		System.out.printf("%nlocal x in mais is %d%n", x);
	}

	public static void useLocalVariable(){
		int x = 25;
		System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
 		++x; // modifica a variável local x desse método
 		System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
	}
	public static void useField(){
		System.out.printf("%nfield x on entering method useField is %d%n", x);
		x *= 10; // modifica o campo x da classe Scopeÿ
		System.out.printf("field x before exiting method useField is %d%n", x);
	}
}