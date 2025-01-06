class animal
{
    void speak()
    {
        System.out.println("animal is speak");
    }
}
class Dog extends animal
{
    void dsip()
    {
        System.out.println("Bhou Bhou ");
    }
    public static void main(String args[])
{
    Dog dog=new Dog();
    dog.speak();
    dog.dsip();
}
}
