import java.util.*;
class duck
{   Scanner sc=new Scanner(System.in);
    int count=0;
    int check(int num)
    {
        int n=num;
        while(n!=0)
        {
            int digit=n%10;
            if(digit==0)
            {
                count++;
            }
            n=n/10;
        }
        if(count>0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    
    void main()
    {
        System.out.println("Enter a number to check ");
        int num=sc.nextInt();
        int temp=check(num);
        if(temp == 1)
        System.out.println("It is a duck number with " + count +" Zero");
        else
        System.out.println("It is not a duck number ");
    }
}