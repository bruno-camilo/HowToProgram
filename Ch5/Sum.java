public class Sum{
	public static void main(String [] args){
		int total = 0;

		for(int number = 2; number <=20; number +=2)
			total += number;
		
		System.out.printf("Sum is %d%n", total);

		// Também funciona
		for(int i = 2; i <= 20; total += i, i += 2);

			System.out.printf("Sum2 is %d%n", total);

	}
}