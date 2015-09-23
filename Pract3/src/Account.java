import java.util.Date;

public class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();	
	}

	public Account(int id, int initialBalance){
		this.id = id;
		this.balance = initialBalance;
		this.annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public void defineId(int id){
		this.id = id;		
	}
	public void defineBalance(double balance){
		this.balance = balance;
	}
	public void defineAnnualInterest(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double deposit(double depo){
		this.balance = balance + depo;
		return balance;
	}
	public double withdraw(double draw){
		this.balance = balance - draw;
		return balance;
	}
	public double getMonthlyInterestRate(){
		double getMonthlyInterestRate = annualInterestRate / 12;
		return getMonthlyInterestRate;
	}
	
	
}
