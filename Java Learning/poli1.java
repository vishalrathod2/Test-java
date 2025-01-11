class A 
{
    int a, b,c;
    void show()
    {
       a = 10;
       b = 20;
         c = a+b;
        System.out.println("Addition is "+c);
    }
}
class B extends A
{
    @Override
    void show()
    {    super.show();
    
        c = a*b;
        System.out.println("Multiplication is "+c);
        
    }
}
class poli1
{
    public static void main(String args[])
    {
        A a = new B();
        a.show();
    }
}