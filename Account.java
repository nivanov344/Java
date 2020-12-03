package school;
import java.util.Date;

public class Account {
	private int id;
	  private double balance, yearInterestRate;
	  private Date dateCreated;

	 public Account() {

	    id = 0;
	    balance = 0;
	    yearInterestRate = 0;
	    dateCreated = new Date();

	  }

	 public Account(int newId, double newBalance) {

		  newId = id;
		  newBalance = balance;

	  }

	 public void setId(int newId) {

		  newId = id;

	  }

	 public int getId() {

	    return id;

	  }

	 public void setBalance(double newBalance) {

		  newBalance = balance;

	  }

	 public double getBalance() {

	    return balance;

	  }

	 public void setYearInterestRate(double newYearInterestRate) {

	    yearInterestRate = newYearInterestRate;

	  }

	 public double getYearInterestRate() {

	    return yearInterestRate;

	  }

	  Date getDateCreated() {

	    return dateCreated;

	  }

	 public double getMonthlyInterestRate() {

	    return yearInterestRate / 12;

	  }

	 public double getMonthlyInterest() {

	    return balance * getMonthlyInterestRate() / 100;

	  }

	 public void withdraw(double withdrawAmount) {

	   balance -= withdrawAmount;

	  }

	 public void deposit(double dep) {

	    balance += dep;

	  }

}
