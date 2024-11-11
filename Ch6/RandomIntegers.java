import java.security.SecureRandom;

public class RandomIntegers{
	
	public static void main(String[] args){

		SecureRandom sr = new SecureRandom();

		for(int i = 0; i <= 20; i++){

			int face = 1 + sr.nextInt(6);
			System.out.printf("%d ", face);

			if(i  % 5 ==0)
				System.out.println();
		}

	}	
}