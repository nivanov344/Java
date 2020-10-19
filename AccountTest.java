
public class AccountTest {

	public static void main(String[] args) {
		
		SavingsAccount bojkov = new SavingsAccount();
		bojkov.name = "Bojkov";
		bojkov.balance = 1000;
		
		bojkov.deposit(50.98);
		bojkov.withdraw(300);

	}

}
