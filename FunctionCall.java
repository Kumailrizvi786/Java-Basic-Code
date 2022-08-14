import java.util.*;
class FunctionCall
{
    void fun1()
    {
        System.out.println("I m in function1");
        fun2();
        System.out.println(" I m back in Function call");
    }
    void fun2()
    {
        System.out.println("I m in function2");
    }
    public static void main(String args[])
    {
        FunctionCall obj=new FunctionCall();
        System.out.println("I m in main function");
        obj.fun1();
        System.out.println("I m in back in main function");
    }
}