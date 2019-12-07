/*
1.6 Write a TestCustomer class in "tester" package ,  to test all of above.
Using Scanner , accept customer details suitably & test all 3 constructors.
Display customer details.
Increase credit limit of the 1st customer by 1000 & display details again.
 */

package com.tester;

import java.util.Scanner;
import com.cdac.core.Customer;

class TestCustomer
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        System.out.println("Enter Email: ");
        System.out.println("Enter Age: ");
        System.out.println("Enter Credit Limit: ");
        
        Customer c = new Customer();

        Customer c2 = new Customer(sc.next(),sc.next(),sc.nextInt());
        
        Customer c3 = new Customer(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());

        c.setCreditLimit(c.getCreditLimit()+1000);

        System.out.println(c.getDetails());


    }
}