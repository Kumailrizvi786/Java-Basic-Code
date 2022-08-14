import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int f =1; // to store factorial (Essentially a product so 1)
        /**All natural number from 1 to num */
        for ( int i = 1 ; i <= num ; i++ ) 
        {
                    f = f * i;
                   // System.out.println("i="+ i +" f= "+ f);
        }
        System.out.println("factorial of  "+ num +" is " + f);
    }
}