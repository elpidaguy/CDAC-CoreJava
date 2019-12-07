/********
3. Display food menu to user. User will select items from menu along with the quantity. Hard code food prices. (eg 1. Dosa 2. Samosa .......10 . Generate Bill ) 
When user enters 'Generate Bill' option, display total bill & exit. Create above class in "tester" package
*/

package com.tester;

import java.util.Scanner;

class Restaurant{

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    boolean flag = false;
    int bill = 0;
    int total = 0;
    int quantity = 0;
    while(!flag)
    {
        System.out.println("Restaurant");
        System.out.println("1.Dosa - 30$");
        System.out.println("2.Rajma Chaval - 60$");
        System.out.println("3.Chole kulche - 50$");
        System.out.println("4.Sandwich - 10$");
        System.out.println("5.Generate Bill");
        System.out.println("6.Display Bill");
        System.out.println("7.Exit");
        System.out.println("Enter Choice: ");

        switch(sc.nextInt())
        {
            case 1:{
                System.out.println("Quantity: ");
                quantity += sc.nextInt();
                bill = bill + quantity * 30;
                quantity = 0;
            }break;
            case 2:{
                System.out.println("Quantity: ");
                quantity += sc.nextInt();
                bill = bill + quantity * 60;
                quantity = 0;                
            }break;
            case 3:{
                System.out.println("Quantity: ");
                quantity += sc.nextInt();
                bill = bill + quantity * 50;
                quantity = 0;                

            }break;
            case 4:{
                System.out.println("Quantity: ");
                quantity += sc.nextInt();
                bill = bill + quantity * 10;
                quantity = 0;                

            }break;
            case 5:{
                System.out.println("Generating bill...");
                total = bill;
                bill = 0;
                System.out.println("Generated");
            }break;
            case 6:{
                System.out.println("Total : " + total);
                total = 0;
            }break;
            case 7:{
                flag = true;
            }break;
        }
    }
}

}