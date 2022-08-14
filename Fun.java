import java.util.*;
class Fun
{
    Scanner sc=new Scanner(System.in);
    public int p,b;
    Fun(int x,int y)
    {
        p=x;
        b=y;
        System.out.println("Parameterized Constructor called "+ p +"\n"+b);
    }
    Fun(Fun a)
    {
        this.p=a.p+10;
        this.b=a.b+10;
        System.out.println("Copy constructor called "+ p + "\n"+ b);
    }
    void main()
    {
        Fun obj=new Fun(20,30);
        Fun obj1=new Fun(obj);
    }
}