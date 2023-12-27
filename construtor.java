import java.util.Scanner;

class pratik
{
    int i,j; // jo number store kre :- 1 5 4 2
    String name;//name store kre := amity
    double yt; // jo point ka value store kre 0.1 4.5

    pratik()
    {
        System.out.println("this is default const");
        System.out.println("hii....");
    }
    pratik(int a,int b)
    {
        System.out.println("this is parameter_const for 2 int");
        i=a;
        j=b;
    }
    pratik(int a,int b,String n)
    {
        System.out.println("this is parameter_const for 2 int and a string");
        i=a;
        j=b;
        name=n;
    }
    pratik(int a,int b,String n,double t)
    {
        System.out.println("this is parameter_const for 2 int and string and double");
        i=a;
        j=b;
        name=n;
        yt=t;
    }
   void show ()
    {
       System.out.println("the 1st number is "+i);
       System.out.println("the 2nd number is "+j);
       System.out.println("the name is "+name);
       System.out.println("the decimal value is "+yt);
    }
}

class sweety
{
    public static void main(String[] args) {
        pratik ob = new pratik();//for default constructor
        System.out.println();
        pratik ob1 = new pratik(5,10);//for 2 integer 
        ob1.show();
        System.out.println();
        pratik ob2 = new pratik(5,10,"Sweety");
        ob2.show();
        System.out.println();
        pratik ob3 = new pratik(5,10,"pratik",20.5);
        ob3.show();

}
}
