package task.guvi;

import java.util.Scanner;

public class AccountData {

		private double balance;
		
		public AccountData() {
			balance = 0.0;
		}
		public AccountData(double balance) {
			this.balance = balance;
		}
		
		public void withdraw(double amount) {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("Withdrawl success. Your current balance is: " + balance);
			}else {
				System.out.println("You don't have sufficient balance to withdraw this value");
			}			
		}
		public void deposit(double amount) {
			balance += amount;
			System.out.println("Deposit success. Updated balance is: " + balance);
		}
		public static void main(String[] args) {
			Scanner amount = new Scanner(System.in);
			System.out.println("Current Balance is: ");
			double balance = amount.nextDouble();
			System.out.println("Enter amount to withdraw: ");
			double withdraw = amount.nextDouble();
			System.out.println("Enter amount to deposit: ");
			double deposit = amount.nextDouble();
			amount.close();
		
			AccountData transaction = new AccountData(balance);
				transaction.withdraw(withdraw);
				transaction.deposit(deposit);
	}

}
