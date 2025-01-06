class A
{
    int a,b,c;
    void aad()
    {
        a = 10; 
        b = 20;
        c = a + b;
        System.out.println("addition is "+c);
    }
    void sub()
    {
        a = 10;
        b = 5;
        c = a - b;
        System.out.println("subtraction of "+c);
    }
}
class B extends A 
{
    void mul()
    {
        a = 10 ;
        b = 5 ;
        c = a * b;
        System.out.println("multiplication of "+c);
    }
    void devi()
    {
        a = 10 ;
        b = 5 ;
        c  = a / b ;
        System.out.println("division of "+c);
    }
}
class C extends B 
{
    void rem()
    {
        a = 10 ;
        b = 5 ;
        c  = a % b ;
        System.out.println("rem of "+c);
    }
}
class Test 
{
    public static void main(String args[])
    {
        C c=new C();
        c.aad();
        c.sub();
        c.mul();
        c.devi();
        c.rem();
    }
}