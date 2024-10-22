import java.util.Scanner;
import java.util.Locale;
public class AccountTest{
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		System.out.printf("Initial name is, %s%n", account.getName());

		System.out.println("Please enter the name: ");
		String name  = sc.nextLine();
		account.setName(name);
		System.out.println();

		System.out.printf("Name in object account is:%n%s%n", account.getName());

		// Exemplo 2
		System.out.println("------------------------------------------------------------------");
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		System.out.printf("account1 name is: %s%n", account1.getName());
		System.out.printf("account2 name is: %s%n", account2.getName());

		// Exemplo 3
		System.out.println("------------------------------------------------------------------");
		// add method displayAccount
		//System.out.printf("%s balance: $%.2f %n", c.getName(), account1.getBalance());
		//System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
		displayAccount(account1);
		displayAccount(account2);


		System.out.print("Enter deposit amount for account1: "); 
		double depositAmount = sc.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n",  depositAmount);
		account1.deposit(depositAmount);
		//Código referente ao ex3.11
		System.out.print("Enter amount withdrawal: ");
		double withdralAmount = sc.nextDouble();
		account1.withdrawal(withdralAmount);

		//System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
		//System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter deposit amount for account2: "); 
		depositAmount = sc.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n",  depositAmount);
		account2.deposit(depositAmount);


		//Código referente ao ex3.11
		
		System.out.print("Enter amount withdrawal: ");
		withdralAmount = sc.nextDouble();
		account2.withdrawal(withdralAmount);

		//System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
		//System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
		displayAccount(account1);
		displayAccount(account2);
		
		sc.close();
	}

	//Ex 3.15
	public static void displayAccount(Account accountToDisplay){
		System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}



}