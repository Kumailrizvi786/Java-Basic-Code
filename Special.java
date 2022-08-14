import java.util.*;
class Special
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int tmp=num, digit=0,fact=1,sum=0;
        while(tmp>0) // as long as we can extract new digits
        {
            digit = tmp % 10;       //Extract digit
            fact=1;             //factorial of a digit
            for(int i=1;i<=digit;i++)//all natural number from 1 to digit
            {
                fact=fact*i;    //product of all natural no. up to digit
            }
            sum = sum + fact; 
            System.out.println(digit+" "+fact+" "+sum);// sum of factorial of digits
            tmp = tmp / 10;         //remove the digit already used
        }
        if( sum == num)     // product of digits is equal to sum of its digits
            System.out.println(num + " is a Special number");
        else
            System.out.println(num + " is not a Special number");
     }
}