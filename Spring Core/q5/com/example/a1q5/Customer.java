package com.example.a1q5;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Customer {

	@Resource(name ="customerAddess")
	private Address address;

	private long customerId, customerContact;
	private String customerName, customerAddress;

	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	
	public long getCustomerContact() {
		return customerContact;
	}

	@Required
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Customer Id" + getCustomerId());
		System.out.println("Customer Name" + getCustomerName());
		System.out.println("Customer Contact" + getCustomerContact());
		System.out.println("Street" + address.getStreet());
		System.out.println("State" + address.getState());
		System.out.println("Zip" + address.getZip());
		System.out.println("Country" + address.getCountry());

	}

}
