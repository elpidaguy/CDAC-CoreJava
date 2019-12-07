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

package com.app;

public class Calculator{
    private double firstNumber, secondNumber;

    double getFirstNumber()
    {
        return firstNumber;
    }

    double getSecondNumber()
    {
        return secondNumber;
    }

    public void setFirstNumber(double first)
    {
        firstNumber = first;
    }

    public void setSecondNumber(double second)
    {
        secondNumber = second;
    }

    public double add()
    {
        return firstNumber+secondNumber;
    }

    public double sub()
    {
        return firstNumber-secondNumber;
    }

    public double mul()
    {
        return firstNumber*secondNumber;
    }

    public double div()
    {
        if(secondNumber == 0)
        {
            System.out.println("Denominator cannot be zero!");
            return 0;
        }
        else
        {
            return firstNumber/secondNumber;
        }
    }
}


/************output****************
C:\Users\dac\Desktop\8393\core java\Day2\bin>java com.tester.TestCalculator
Please Enter 2 Numbers:
10
12
----CALCULATOR----
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Enter Your Choice:
1
Addition is: 22.0
----CALCULATOR----
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Enter Your Choice:
2
Subtraction is: -2.0
----CALCULATOR----
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Enter Your Choice:
3
Multiplication is: 120.0
----CALCULATOR----
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Enter Your Choice:
3
Multiplication is: 120.0
----CALCULATOR----
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Enter Your Choice:
4
Division is: 0.8333333333333334
----CALCULATOR----
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Enter Your Choice:
5
Thank You!

C:\Users\dac\Desktop\8393\core java\Day2\bin>

*/