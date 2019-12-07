package com.app.core;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class Customer implements Comparable<Customer>,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email,password; 
	double regAmount;
	private Date regDate;
	private CustomerType ctype;
	
//	ArrayList<Address> listAddress = new ArrayList<Address>();
	HashMap<String,Address> addressMap;

	public Customer(String email, String password, double regAmount, Date regDate, CustomerType custType) {
		super();
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.ctype = custType;
		this.addressMap = new HashMap<>();
	}
	
	public void linkAddress(String city,String state,String country,String phoneNo,String type)
	{
		addressMap.put(type, new Address(city,state,country,phoneNo,type));
		
		for(Address a : addressMap.values())
		{
			System.out.println(a);
		}
	}
	
	public void updateAddress(String ucity, String ustate, String ucountry, String uphoneNo, String utype)
	{
	
		Address uAdd = addressMap.get(utype);
		
		if(uAdd != null)
		{
			uAdd.setCity(ucity);
			uAdd.setState(ustate);
			uAdd.setCountry(ucountry);
			uAdd.setPhoneNo(uphoneNo);
		}
		
		for(Address a : addressMap.values())
		{
			System.out.println(a);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public HashMap<String, Address> getAddressMap() {
		return addressMap;
	}


	public CustomerType getCtype() {
		return ctype;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", regAmount=" + regAmount + ", regDate="
				+ regDate + ", ctype=" + ctype + ", addressMap=" + addressMap + "]";
	}

	@Override
	public int compareTo(Customer o) {
		return email.compareTo(((Customer) o).getEmail());
	}

}
