public class BreakTest{
	
	public static void main(String[] args){
		int i;

		for(i = 1; i <= 10; i++){
			if(i == 5){
				break;
			}
			System.out.printf("%d ", i);
		}
		System.out.printf("%nBroke out of loop at count = %d%n", i);
	}
}