public class Account{
	private String name;
	private double balance;

	public Account(){}


	public Account(String name, Double balance){
		this.name = name;
		
		if(balance > 0.0){
			this.balance = balance;
		}
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Double getBalance(){
		return balance;
	}

	public void deposit(Double depositAmout){
		if(depositAmout > 0.0)
			this.balance += depositAmout; 
	}
	
	//Codigo referente ao Ex 3.11
	public void withdrawal(double withdrawalAmount){
		if(withdrawalAmount > balance)
			System.out.println("Withdrawal amount exceeded account balance");
	
		else
			balance -= withdrawalAmount;
		

		
	}

}