class poli
{
    void add()
    {
        int a,b,c;
        a=10;
        b=20;
        c=a+b;
        System.out.println("Addition is "+c);
    }
    int add(int x , int y)
    {   
        int c;
        c=x+y;
        return c;
    }
    void add(int x ,double y)
    {   double c;
        c=x+y;
        System.out.println("Addition is "+c);
    }
    public static void main(String args[])
{
    poli r=new poli();
    r.add(); r.add(10,10.50);
    int add = r.add(100,200);
    System.out.println(add);
}

}
