

public class EnumTest{
	public static void main(String[] args){
		System.out.println("All books:");

		for(Book book: Book.value())
			System.out.printf("%-10s%-45s%s%n", book, book.getTitle(),book.getCopyrightYear());

 		System.out.printf("%nDisplay a range of enum constants:%n");

		// imprime os primeiros quatro livros
		for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
		System.out.printf("%-10s%-45s%s%n", book, book.getTitle(),book.getCopyrightYear());
		 

	}
	
}