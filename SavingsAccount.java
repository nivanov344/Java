public class SavingsAccount {
	public double balance;
	public String name;
	public double interstRate = 0.01;
	
	public void deposit(double sum){
		balance += sum;
	}
	public void withdraw (double sumToWithdraw){
		if (sumToWithdraw<0 || sumToWithdraw > balance){
			System.out.println("Error");
			return;
		}else{
			balance -=sumToWithdraw;
			System.out.println("Succesful withdrawl of " + sumToWithdraw + " , new balance is " + balance);
		}
	}
		
}
