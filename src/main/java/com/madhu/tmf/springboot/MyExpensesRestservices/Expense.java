package com.madhu.tmf.springboot.MyExpensesRestservices;

public class Expense {
	public String expDate;
	public String expCategory;
	public String expDescription;
	public double expAmount;
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getExpCategory() {
		return expCategory;
	}
	public void setExpCategory(String expCategory) {
		this.expCategory = expCategory;
	}
	public String getExpDescription() {
		return expDescription;
	}
	public void setExpDescription(String expDescription) {
		this.expDescription = expDescription;
	}
	public double getExpAmount() {
		return expAmount;
	}
	public void setExpAmount(double expAmount) {
		this.expAmount = expAmount;
	}
	
}
