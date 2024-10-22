public class Date{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay(){
		return day;
	}

	public void setDay(){
		this.day = day;
	}


	public int getMonth(){
		return month;
	}

	public void setMonth(){
		this.month = month;
	}


	public int geYear(){
		return year;
	}

	public void setYear(){
		this.year = year;
	}

	public String displayDate (){
		return day 
				+ "/"
				+ month
				+"/"
				+ year;
	}

}