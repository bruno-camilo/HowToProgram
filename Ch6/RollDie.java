import java.security.SecureRandom;

public class RollDie{
	public static void main(String[] args){
		int frequency1 = 0; // contagem de 1s lançados
        int frequency2 = 0; // contagem de 2s lançados
		int frequency3 = 0; // contagem de 3s lançados
		int frequency4 = 0; // contagem de 4s lançados
		int frequency5 = 0; // contagem de 5s lançados
	    int frequency6 = 0;

		SecureRandom  sr = new SecureRandom();

		for(int i = 1; i <= 6000; i++){
			int face = 1 + sr.nextInt(6);

			switch(face){
			case 1:
				++frequency1;
				break;
			case 2:
				++frequency2;
				break;
			
			case 3:
				++frequency3;
				break;
			
			case 4:
				++frequency4;
				break;
			
			case 5:
				++frequency5;
				break;
			
			case 6:
				++frequency6;
				break;
			
			}
		}

		System.out.println("Face\tFrequency"); // cabeçalhos de saída
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4,frequency5, frequency6);

	}

}