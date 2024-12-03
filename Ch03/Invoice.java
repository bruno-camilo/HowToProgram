public class Invoice{
	private String number;
	private String description;
	private int item;
	private double price;

	public Invoice(String number, String description, int item, double price){
		this.number = number;
		this.description = description;
		this.item = item;
		this.price = price;
	}

	public String getNumber(){
		return number;
	}

	public void setNumber(String number){
		this.number = number;
	}

	public  String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description = description;
	}
	public int getItem(){
		return item;
	}

	public void setItem(int item){
		this.item = item;
	}
	public double getPrice(){
		return price;
	}

	public void setPrice(double price ){
		this.price = price;
	}

	public double getInvoice(){
		return price * item;
	}


}