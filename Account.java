
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyformat= new DecimalFormat ("'$'###,##0.00");
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public double calCheckingWithdraw(double amount) {
		checkingBalance = checkingBalance - amount;
		return checkingBalance;		
	}
	public double calSavingWithdraw(double amount) {
		savingBalance = savingBalance - amount;
		return savingBalance;		
	}
	
	
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}

	public double calcSavingDeposit(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}
	
	
	public void getCheckingWithdrawInput() {
		System.out.print("Checking balance: " + moneyformat.format(checkingBalance));
		System.out.print("Amount you want to withdraw is: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount)>=0) {
			calCheckingWithdraw(amount);
			System.out.print("New checking balance: " + moneyformat.format(checkingBalance));
		} else {
			System.out.println("Balance cannot be negative.");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.print("Saving balance: " + moneyformat.format(savingBalance));
		System.out.print("Amount you want to withdraw is: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount)>=0) {
			calSavingWithdraw(amount);
			System.out.print("New Saving balance: " + moneyformat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be negative.");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Balance: " + moneyformat.format(checkingBalance));
		System.out.print("Amount you want to deposit: ");
		double amount = input.nextDouble();

		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking balance: " + moneyformat.format(checkingBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}


	public void getSavingDepositInput() {
		System.out.println("Saving Balance: " + moneyformat.format(savingBalance));
		System.out.print("Amount you want to deposit: ");
		double amount = input.nextDouble();

		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving balance: " + moneyformat.format(savingBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
}
