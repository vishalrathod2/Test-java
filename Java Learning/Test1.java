class A 
{   void show()
    {
    System.out.println("Hello Vishal");
    }
    // int a = 200; //instance variable
}
class B extends A 
{
    // int a = 100; //instance variable
    void show()
    {    
        super.show();
        System.out.println("Hello Virat Bhai");
    //     System.out.println(super.a); //super keyword is used to refer immediate parent class instance variable
    }
    // }
}

class Test1 
{
    public static void main(String[] args) 
    {
        B r = new B();
        r.show();

    }
}