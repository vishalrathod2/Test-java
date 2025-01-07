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
        B r = new B();  // Create a single object of class B
        r.input();      // Input numbers A and B
        r.add();        // Perform addition
        r.sub();        // Perform subtraction

        // Use the same object to access multiplication
        C r2 = new C(); // Create an object of class C
        r2.a = r.a;   // Reuse the values of `a` and `b`
        r2.b = r.b;
        r2.mul();
      
    }
}