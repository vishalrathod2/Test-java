class A 
{
    int a = 200;
}
class B extends A 
{
    int a = 100;
    void show()
    {    
        
        System.out.println(a);
        System.out.println(super.a);
    }
}

class Test1 
{
    public static void main(String[] args) 
    {
        B r = new B();
        r.show();

    }
}