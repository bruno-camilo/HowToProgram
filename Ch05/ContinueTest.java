public class ContinueTest{
	public static void main(String[] args){
		for(int i = 1; i <=10; i++){
			if(i == 5)
				continue;

			System.out.printf("%d ", i);
		}
	System.out.printf("%nUsed continue to skip printing 5%n");
	}
}