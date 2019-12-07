package tester;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Address;
import com.app.core.Customer;

import io_utils.IOUtils;

import static utils.ValidationRules.*;
import static utils.CustomerUtils.*;

public class TestCustomer {

	public static void main(String[] args) {

		HashMap<String, Customer> customerMap = new HashMap<>();

		try {
			customerMap = IOUtils.readObject();
		} catch (ClassNotFoundException | IOException e1) {
			e1.printStackTrace();
		}

		boolean flag = false;

		int ch;
		try (Scanner sc = new Scanner(System.in)) {
			while (!flag) {
				System.out.println("Customer Management System");
				System.out.println("1.Register Customer");
				System.out.println("2.Display Customers");
				System.out.println("3.Add Address");
				System.out.println("4.Customer Login");
				System.out.println("5.UnSubscribe Customer");
				System.out.println("6.Display Customer Type wise");
				System.out.println("7.Update Address");
				System.out.println("8.Sort by Email");
				System.out.println("9.Sort by Reg Date");
				System.out.println("99.Exit");
				System.out.println("Please Enter Choice: ");
				try {
					ch = sc.nextInt();
					switch (ch) {
					case 1: {
						System.out.println(
								"Enter Customer Details - email,password,Reg amount,Reg Date, type : SILVER/GOLD/PLATINUM");
						addCustomer(new Customer(validateEmail(sc.next()), sc.next(), sc.nextDouble(),
								validateDate(sc.next()), validateCustomerType(sc.next())), customerMap);
					}
						break;
					case 2: {
						for (Customer c : customerMap.values()) {
							System.out.println(c);
						}
					}
						break;
					case 3: {
						System.out.println("Enter Email and Password: ");
						Customer c = tryLogin(validateEmail(sc.next()), sc.next(), customerMap);
						if (c != null)
							System.out.println("Enter city,state,country,phoneNo,type");
						c.linkAddress(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());

						for (Address a : c.getAddressMap().values()) {
							System.out.println(a);
						}
					}
						break;
					case 4: {
						System.out.println("Enter Email and Password: ");
						tryLogin(validateEmail(sc.next()), sc.next(), customerMap);
					}
						break;
					case 5: {
						System.out.println("Enter Email of Customer you want to unsubscribe ");
						deleteCustomer(validateEmail(sc.next()), customerMap);
					}
						break;
					case 6: {
						System.out.println("Enter Type of Customer: ");
						displayTypeWise(validateCustomerType(sc.next()), customerMap);
					}
						break;
					case 7: {
						System.out.println("Enter Email and Password: ");
						Customer c = tryLogin(validateEmail(sc.next()), sc.next(), customerMap);
						if (c != null) {
							System.out.println("Enter city,state,country,phoneNo,type");
							c.updateAddress(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
						}
					}
						break;
					case 8: {
						sortByEmail(customerMap);
					}
						break;
					case 9: {
						sortByRegDate(customerMap);
					}
						break;
					case 99: {
						IOUtils.writeObject(customerMap);
						flag = true;
					}
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					// e.printStackTrace();
					// flag = true;
					System.out.println(e.getMessage());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
