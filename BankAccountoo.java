
public class BankAccountoo {
	int account = 0;

	public static void check(BankAccount bank) {
		
		System.out.println(bank);
		System.out.println(bank.account);
		
		bank.account = 90;
	}	
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();
		
		yoon.account = 10; //¿Á»ó ¿Ã¶ó°¨.
		
		System.out.println(yoon);
		System.out.println(yoon.account);				
		
		check(yoon);
		
		System.out.println(yoon.account);		
	}

}
	


