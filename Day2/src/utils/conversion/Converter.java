/************
4. Write a class Converter.java , in package "utils.conversion"
Add static methods for conversion & returning result  to caller.
5.1 Convert pounds to kilogram(1 pound=0.4536 Kg)
eg : I/P 100
O/p 45.36Kg
5.2 Convert the temperature in Celsius to Fahrenheit (F = C× 9/5 + 32)
5.3 Convert seconds into a formatted string , to display hour,min,seconds
eg : I/P 67890
O/P  18h51m30s
********/

package utils.conversion;
import java.util.Scanner;

class Converter
{
    static double convWeight(double pound)
    {
        return pound*0.4536;
    }

    static double convTemp(double celc)
    {
        return ((celc * 9/5) + 32);
    }

    static String convTime(double second)
    { 
    double hour = second / 3600; 
  
    second %= 3600; 
    double minutes = second / 60 ; 
  
    second %= 60; 
    double seconds = second; 
        return (int)hour+"h"+(int)minutes+"m"+(int)seconds+"s";
    }

    public static void main(String args[])
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while(!flag)
        {
            System.out.println("Converter");
            System.out.println("1.Pounds to Kilogram");
            System.out.println("2.Celcius to Farenheit");
            System.out.println("3.Seconds to TimeStamp");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");

            switch(sc.nextInt())
            {
                case 1:{
                    System.out.println("Enter Pound: ");
                    System.out.println("Kilogram: "+ Converter.convWeight(sc.nextDouble()));
                }break;
                case 2:{
                    System.out.println("Enter Celcius: ");
                    System.out.println("Farenheit: "+ Converter.convTemp(sc.nextDouble()));
                }break;
                case 3:{
                    System.out.println("Enter Seconds: ");
                    System.out.println("Timestamp: "+ Converter.convTime(sc.nextDouble()));
                }break;
                case 4:{
                    flag = true;
                }break;
            }
        }
    }
}