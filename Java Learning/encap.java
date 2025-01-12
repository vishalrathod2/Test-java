class A
{
    private int value;

    public void setvalue(int x)
    {
        value=x;
    }
    public int getvalue()
    {
        return ++value;
    }
}
class encap
{
    public static void main(String args[])
    {
        A r=new A();
        r.setvalue(100);
        System.out.println(r.getvalue());
    }
}