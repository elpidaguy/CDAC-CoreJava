package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import com.app.core.Customer;
import com.app.core.CustomerType;

import cust_excs.CustomerHandlingException;

public class CustomerUtils {
	
	public static void addCustomer(Customer c, HashMap<String,Customer> customerMap) throws CustomerHandlingException
	{
		if(customerMap.containsKey(c.getEmail()))
		{
			throw new CustomerHandlingException("Email is already registred");
		}
		customerMap.put(c.getEmail(), c);
	}
	
	public static Customer tryLogin(String email, String pass, HashMap<String,Customer> customerMap)
	{
		Customer c = customerMap.get(email);
		if(c != null && c.getPassword().equals(pass))
		{
			System.out.println("Login Successfull!");
			return customerMap.get(email);
		}
		else
		{
			System.out.println("Login Failed!!");
			return null;
		}
	}
	
	public static void deleteCustomer(String email, HashMap<String,Customer> customerMap) throws CustomerHandlingException
	{
		Customer c = customerMap.get(email);
		if(c == null)
		{
			throw new CustomerHandlingException("Customer Not Found");
		}
		
		customerMap.remove(email);
		System.out.println("Customer Unsubscribed Successfully!");
	}
	
	public static void displayTypeWise(CustomerType c, HashMap<String,Customer> customerMap) throws CustomerHandlingException
	{
		ArrayList<Customer> typeWise =  new ArrayList<Customer>();
		
		for(Customer cust : customerMap.values())
		{
			if(cust.getCtype() == c)
			{
				typeWise.add(cust);
			}
		}
		
		if(typeWise.size() == 0)
		{
			throw new CustomerHandlingException("No Customer of type"+ c +"found");
		}
		
		for(Customer c2 : typeWise)
		{
			System.out.println(c2);
		}
	}
	
	public static void sortByEmail(HashMap<String,Customer> customerMap) throws CustomerHandlingException
	{
			ArrayList<Customer> customerList = new ArrayList<Customer>(customerMap.values());
			
	//		HashSet<Customer> hs = new HashSet<>(customerList);
			
			Collections.sort(customerList);
			
			for(Customer s : customerList)
			{
					System.out.println(s);
			}

	}
	
	public static void sortByRegDate(HashMap<String,Customer> customerMap) throws CustomerHandlingException
	{
		ArrayList<Customer> customerList = new ArrayList<Customer>(customerMap.values());
		
		Collections.sort(customerList, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getRegDate().compareTo(o2.getRegDate());
			}
			
		});
		
		for(Customer s : customerList)
		{
				System.out.println(s);
		}
	}

}
