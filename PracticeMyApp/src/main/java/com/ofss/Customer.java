package com.ofss;

public class Customer {

	
	String customerName;
	String customerLocation;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String customerLocation) {
		super();
		this.customerName = customerName;
		this.customerLocation = customerLocation;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerLocation=" + customerLocation + "]";
	}
	
	
	
}
