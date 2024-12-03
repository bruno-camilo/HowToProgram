import java.util.Scanner;
import java.util.Locale;

public class MaximumFinder{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter three floating-point values separated by spaces: ");
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		double number3 = sc.nextDouble();

		double result = maximum(number1, number2, number3);

		System.out.println("Maximum is: "+ result);
	}


	public static double maximum(double x, double y, double z){

		double maximumValue = x;

		if(y > maximumValue)
			maximumValue = y;

		if(z > maximumValue)
			maximumValue = z;

	return maximumValue;
		
	}
	
}