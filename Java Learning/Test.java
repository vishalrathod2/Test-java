import java.util.Scanner;
class A
{
    int a,b,c;
    Scanner scanner = new Scanner(System.in);
    void input(){
    System.out.println("Enter the number  A :");
    a = scanner.nextInt();
    System.out.println("Enter the number B :");
    b = scanner.nextInt();
    }
    void aad()
    {
        c = a + b;
        System.out.println("addition is "+c);
    }
    void sub()
    {
 
        c = a - b;
        System.out.println("subtraction of "+c);
    }
}
class B extends A 
{
    void mul()
    {
 
        c = a * b;
        System.out.println("multiplication of "+c);
    }
    void devi()
    {
  
        c  = a / b ;
        System.out.println("division of "+c);
    }
}
class C extends B 
{
    void rem()
    {
   
        c  = a % b ;
        System.out.println("rem of "+c);
    }
}
class Test 
{
    public static void main(String args[])
    {
        C c=new C();
        c.input();
        c.aad();
        c.sub();
        c.mul();
        c.devi();
        c.rem();
    }
}