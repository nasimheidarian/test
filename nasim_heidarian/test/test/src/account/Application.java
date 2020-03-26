package account;

import java.util.List;
import java.util.Scanner;

public class Application {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		
        System.out.println("Enter Account number ");
		int accountnum = sc.nextInt();
		List<Account> account = Account.CreateAccount(accountnum);
		
		for (int i=1;i<= accountnum;i++) {
			System.out.println(account.get(i));
		}
		
	}

}
