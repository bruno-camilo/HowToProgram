// Ex 3.13 
import java.util.Locale;

public class EmployeeTest{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		
		Employee e1 = new Employee("Maria", "Da Silva", 2000.00);
		Employee e2 = new Employee("Joao", "Souza", 1500.00);

		System.out.printf("%s, annual salary $ %.2f%n ", e1.getFirstName() + " " + e1.getLastName() , e1.anualSalary());
		System.out.printf("%s, annual salary $ %.2f%n ", e2.getFirstName() + " " +e2.getLastName(), e2.anualSalary());

		e1.increase();
		e2.increase();

		System.out.printf("%s, actual salary $ %.2f%n ", e1.getFirstName() + " " + e1.getLastName() , e1.getSalary());
		System.out.printf("%s, actual salary $ %.2f%n ", e2.getFirstName() + " " + e2.getLastName(), e2.getSalary());

	}
}