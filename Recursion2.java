class Recursion2
{
    void recur(int i) //recursive function
    {
        System.out.println("recursion going on");
        if(i<=10)
        recur(i);
    }
    public static void main(String args[])// non recursive function
    {
        Recursion2 obj=new Recursion2();
        obj.recur(1);
    }
}