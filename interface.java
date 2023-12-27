
what is interface?
interface is a group of related method with empty body.interface contains only those member functions whose body is not defined and must be implemented in the class in which the interface is implemented.In interface,when a data member is declared,the value of that data member cannot be changed because it contain final keyword in it.interface can inherit another interface.we can also achieve multiple inheritance using interface.

An example of interface with code:

interface a
{
    void greet();
}
class b implements a
{
    public void greet()
    {
        System.out.println("hello ji");
    }
}
public class Main{
    public static void main(String [] args)
    {
        b b1=new b();
        b1.greet();
    }
}

//Multiple inheritance using interface
interface a
{
    public void greet();
}
interface b
{
    public void greet1();
}
class c implements a,b
{
    public void greet()
    {
        System.out.println("hello ");
    }
    public void greet1()
    {
        System.out.println("namastey ");
    }
    public void greet3()
    {
        System.out.println("Namashkaar ");
    }
}
public class Main{
    public static void main(String [] args)
    {
        c c1=new c();
        c1.greet();
        c1.greet1();
        c1.greet3();
    }
}

-----------------------------------x----------------x---------------
Inheritance in interface:-

interface a
{
    public void greet();
}
interface b extends a
{
    public void greet1();
}
class c implements b
{
    public void greet()
    {
        System.out.println("hello ");
    }
    public void greet1()
    {
        System.out.println("namastey ");
    }
    public void greet3()
    {
        System.out.println("Namashkaar ");
    }
}
public class Main{
    public static void main(String [] args)
    {
        c c1=new c();
        c1.greet();
        c1.greet1();
        c1.greet3();
    }
}
