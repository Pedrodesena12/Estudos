package entitiess;

public class SavingsAccunt extends Account{
private Double interestRate;

public SavingsAccunt() {
	super();
}

public SavingsAccunt(Integer number, String holder, Double balance, Double interestRate) {
	super(number, holder, balance);
	this.interestRate = interestRate;
}

public Double getInterestRate() {
	return interestRate;
}

public void setInterestRate(Double interestRate) {
	this.interestRate = interestRate;
}
public void updateBalance() {
	balance += balance * interestRate;
}
}
