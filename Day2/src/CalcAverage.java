/*1. Accept any numbers as command line arguments from user. If user supplies less than 2 arguments supply error message & terminate. If  correct, compute average & display the same.
(args.length = to find array size 
Double.parseDouble(s) for parsing double values)
*/

class CalcAverage {

    public static void main(String[] args)
    {
        if(args.length < 2)
        {
            System.out.println("Error, needs exactly 2 arguments");
            return;
        }

        double res = 0.0;  //primitive double

        for(int i=0;i<args.length;i++)
        {
            res += Double.parseDouble(args[i]); //class Double
        }

        res = res/args.length;

        System.out.println("Result is: "+ res);

    }
    
};



/******************OUTPUT*****************
C:\Users\dac\Desktop\8393\core java\Day2\bin>java CalcAverage
Error, needs exactly 2 arguments

C:\Users\dac\Desktop\8393\core java\Day2\bin>java CalcAverage 10 10
Result is: 10.0

C:\Users\dac\Desktop\8393\core java\Day2\bin>

****************************************/