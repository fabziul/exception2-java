package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		try {

			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, limit);
			System.out.println("Enter the amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			
			System.out.println("New Balance: "+account.getBalance());
			
		} catch (Exception e) {
			System.out.println("Erro Exception: "+e.getMessage());
		}
		sc.close();
	}

}
