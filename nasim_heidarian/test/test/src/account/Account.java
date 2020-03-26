package account;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	String accounttype;
	int accountid;
	
	public Account(int accountid,String accounttype){
		
		this.accountid = accountid;
		this.accounttype = accounttype;
	
		}

	public static List<Account> CreateAccount(int accountnum){
		          List<Account> account = new ArrayList<>();	
		          
		         while (accountnum>0) {
		        	 Account a = new Account(1000+accountnum , "saving");
		        	 account.add(a);
		        	 accountnum --;
		         }
		         
		         return account;
			
	}

	@Override
	public String toString() {
		return "Account [accounttype=" + this.accounttype + ", accountid=" + this.accountid + "]";
	}

	

	
}
