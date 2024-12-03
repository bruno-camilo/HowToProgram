import java.util.Locale;

public class InvoiceTest{

	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Invoice inv = new Invoice("001", "Nota Referente ao ex 3.12", 3, 20.00);
		double valueInvoice = inv.getInvoice();
		System.out.printf("The value of the invoice is: %.2f", valueInvoice);
	}
}