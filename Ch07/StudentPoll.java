public class StudentPoll{
	
	public static void main(String[] args){
		
		int[] response = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 10, 2, 3, 3, 2, 14};
		int[] frequency = new int[6];

		for (int i = 0; i < response.length; i++){
			try{
				++frequency[response[i]];
			
			}catch(ArrayIndexOutOfBoundsException e){
				
				System.out.println(e);
				System.out.printf(" 	response[%d] == %d%n%n", i, response[i]);
			}
		}

		System.out.printf("%s%10s%n", "Rating", "Frequency");
		for (int rating = 1; rating < frequency.length; rating++)
			System.out.printf("%6d%10d%n", rating, frequency[rating]);
	}
}