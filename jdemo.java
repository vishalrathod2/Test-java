import java.util.Scanner;

class A
{   
    int a,b,c;
    Scanner scanner=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the number A:");
        a =scanner.nextInt();
        System.out.println("Enter the nuber B:");
        b = scanner.nextInt();
    }
    void add()
    {
      
       c = a + b;
       System.out.println("The  addtion is"+c);
        }
}
class B extends A 
{
    void sub()
    {
       
        c = a - b;
        System.out.println("The subtraction is "+c);
    }
}
class C extends A 
{
    void mul()
    {
       
        c = a * b;
        System.out.println("The multiplication is "+c);
    }
}
class jdemo
{
    public static void main(String args[])
    {   
        B b=new B();
        C c=new C();
        b.input();
        c.input();
        b.sub();
        c.mul();
        b.add();
    }
}