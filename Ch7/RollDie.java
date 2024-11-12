import java.security.SecureRandom;

public class RollDie{
	
	public static void main(String[] args){
		SecureRandom secureRandom = new SecureRandom();
		int[] frequency = new int[7];

		for(int i = 1; i <= 6000000; i++)
			++frequency[1 + secureRandom.nextInt(6)];

		System.out.printf("%s%10s%n", "Face","Frequency");

		for(int j = 1; j < frequency.length; j++)
			System.out.printf("%4d%10d%n", j, frequency[j]);
	}

}