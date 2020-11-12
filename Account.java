package school;
import java.util.Date;

public class Account {
	private int id;
	  private double balance, yearInterestRate;
	  private Date dateCreated;

	  Account() {

	    id = 0;
	    balance = 0;
	    yearInterestRate = 0;
	    dateCreated = new Date();

	  }

	  Account(int newId, double newBalance) {

		  newId = id;
		  newBalance = balance;

	  }

	  void setId(int newId) {

		  newId = id;

	  }

	  int getId() {

	    return id;

	  }

	  void setBalance(double newBalance) {

		  newBalance = balance;

	  }

	  double getBalance() {

	    return balance;

	  }

	  void setYearInterestRate(double newYearInterestRate) {

	    yearInterestRate = newYearInterestRate;

	  }

	  double getYearInterestRate() {

	    return yearInterestRate;

	  }

	  Date getDateCreated() {

	    return dateCreated;

	  }

	  double getMonthlyInterestRate() {

	    return yearInterestRate / 12;

	  }

	  double getMonthlyInterest() {

	    return balance * getMonthlyInterestRate() / 100;

	  }

	  void withdraw(double withdrawAmount) {

	   balance -= withdrawAmount;

	  }

	  void deposit(double dep) {

	    balance += dep;

	  }

}
