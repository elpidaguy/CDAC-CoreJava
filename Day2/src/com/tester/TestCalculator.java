/*************

2. Create a class Calculator with 2 private double data members firstNumber & secondNumber.
Supply getters & setters.
Add 4 instance methods add,subtract,multiply & divide , without parameters , to return result of calculation.
Divide method should return 0 in case of 0 denominator.
Create a TestCalculator class with scanner.
Accept 2 numbers from user & set them in Calculator.
Menu 1: Add
2 : Subtract 
3 : Multiply
4 : Divide
5 :Exit.
 
*/

package com.tester;

import com.app.Calculator;
import java.util.Scanner;

class TestCalculator{

    public static void main(String args[])
    {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 2 Numbers: ");
        calc.setFirstNumber(sc.nextDouble());
        calc.setSecondNumber(sc.nextDouble());

        boolean flag = false;
        while(flag != true)
        {
            System.out.println("----CALCULATOR----");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter Your Choice: ");

            switch(sc.nextInt())
            {
                case 1:{
                    System.out.println("Addition is: "+ calc.add());
                }break;
                case 2:{
                    System.out.println("Subtraction is: "+ calc.sub());
                }break;
                case 3:{
                    System.out.println("Multiplication is: "+ calc.mul());
                }break;
                case 4:{
                    System.out.println("Division is: "+ calc.div());
                }break;
                case 5:{
                    flag = true;
                }break;
            }

        }
        System.out.println("Thank You!");
    }
}