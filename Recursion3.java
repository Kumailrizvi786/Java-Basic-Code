class Recursion3
{
    void recur(int i) //recursive function
    {
        if(i<=10)// recursive case
        {
            System.out.println("recursion going on i="+i);
            recur(i+1);
        }
        else // i>10 base (implicitly)
            System.out.println("ends here");
        
    }
    public static void main(String args[])// non recursive function
    {
        Recursion3 obj=new Recursion3();
        obj.recur(1);
    }
}
/**
 disadvatages of recursive functions:
1. uses more memory.
2. it is slower.
*/