import java.util.*;
class AdamNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Number is "+num);
        int square=num*num;
        System.out.println("square  of the number is "+square);
        int tmp=square,rev=0,digit=0;
        while(tmp>0)    //while number has digits left
        {
            digit = tmp % 10;   //Extract digit from right side
            rev=rev*10;         //left shift
            rev=rev+digit;       // placing digit at unit place
            tmp = tmp / 10;     //remove the digit already used
        }
        System.out.println("Reverse of square of the number is "+rev);
        int sqrt=(int)Math.sqrt(rev);
        System.out.println("Square root of Reverse of square of the number is "+sqrt);
        tmp=sqrt;
        rev=0;
         while(tmp>0)    //while number has digits left
        {
            digit = tmp % 10;   //Extract digit from right side
            rev=rev*10;         //left shift
            rev=rev+digit;       // placing digit at unit place
            tmp = tmp / 10;     //remove the digit already used
        }
         System.out.println("Reverse of Square root of Reverse of square of the number is "+rev);
        if(num==rev)
            System.out.println(num+" is Adam number");
        else
            System.out.println(num+" is not Adam number");
    }
}