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
        B obj = new B();  // Create a single object of class B
        obj.input();      // Input numbers A and B
        obj.add();        // Perform addition
        obj.sub();        // Perform subtraction

        // Use the same object to access multiplication
        C obj2 = new C(); // Create an object of class C
        obj2.a = obj.a;   // Reuse the values of `a` and `b`
        obj2.b = obj.b;
        obj2.mul();
      
    }
}