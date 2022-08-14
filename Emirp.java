import java.util.*;
class Emirp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int tmp=num,rev=0,digit=0;
        while(tmp>0)    //while number has digits left
        {
            digit = tmp % 10;   //Extract digit from right side
            rev=rev*10;         //left shift
            rev=rev+digit;       // placing digit at unit place
            tmp = tmp / 10;     //remove the digit already used
        }
        int f1=0;
        for(int i=1;i<=num;i++) // probable factor
        {
            if(num%i==0)        // if i is actual factor of num
            {
                //System.out.println(i);
                f1++;
            }
        }
        int f2=0;
        for(int i=1;i<=rev;i++) //probable factor
        {
            if(rev%i==0)    // if i is actual factor of rev
            {
                //System.out.println(i);
                f2++;
            }
        }
        if(f1==2 && f2==2 ) // if num and rev both are prime
            System.out.println(num + " is Emirp number");
        else
            System.out.println(num + " is not Emirp number");
        }
}