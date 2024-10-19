import java.util.Scanner;

public class Product{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y , z ,result;

		System.out.print("Enter first number: ");
		x = sc.nextInt();
		System.out.print("Enter second number: ");
		y = sc.nextInt();
		System.out.print("Enter third number: ");
		z = sc.nextInt();
  		result = x * y * z;
		System.out.printf("%s %d", "Product is", result );
		
		sc.close();
	
	}
}