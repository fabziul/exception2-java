package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit (double amount) {
		this.balance += amount;
	}
	
	public void withdraw (double amount) {
		if (this.balance - amount <= 0 || amount > this.withdrawLimit) {
			throw new DomainException("Saldo insuficiente para saques ou valor superior ao permitido: "+this.withdrawLimit);
			// throw new DomainException("Reservation dates for update must be future dates. ");
		} else {
			this.balance -= amount;
		}
	}
	

	

}