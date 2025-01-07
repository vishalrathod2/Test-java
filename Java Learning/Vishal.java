class Demo 
{
    int roll , mark;
    String  name;
    void input()
    {
       System.out.println("enter the roll mark & name");
    }
}
class Vishal extends Demo
{
    void disp()
    {
        roll =14;
        mark=80;
        name= "vishal";
        System.out.println(roll+" "+mark+" "+name);
    }
    public static void main(String args[])
    {
     Vishal r=new Vishal();
     r.input(); r.disp();
    }

}
