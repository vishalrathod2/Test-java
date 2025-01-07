import java.util.Scanner;
class A 
{   
    Scanner sc = new Scanner(System.in);
    int a ,b ;
    void input()
    {
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
    }
    A()
    {
        int a;
        // System.out.println(); //constructor
    }
// {   void show()
//     {
//     System.out.println("Hello Vishal");
//     }
    // int a = 200; //instance variable
}
class B extends A 
{ 

    B()
    {
        int b;
        // System.out.println(); //constructor
    }
    // int a = 100; //instance variable
    // void show()
    // {    
    //     super.show();
    //     System.out.println("Hello Virat Bhai");
    // //     System.out.println(super.a); //super keyword is used to refer immediate parent class instance variable
    // }
    // }
}

class Test1 
{
    public static void main(String[] args) 
    {
        B r = new B();
        r.input();
        System.out.println("The value of a is:"+r.a);
        System.out.println("The value of b is:"+r.b);
        // r.show(); //method calling

    }
}