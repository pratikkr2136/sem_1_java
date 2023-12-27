Inheritance:

//Single level inheritance:

import java.util.*;
class student
{
    public String name;
    protected int roll;
}
class marks extends student
{
    int marks1,marks2,marks3;
    public void show()
    {
        int total=marks1+marks2+marks3;
        System.out.println("Your name is "+name);
        System.out.println("Your roll is "+roll);
        System.out.println("Your total marks is "+total);
    }
}
public class Main
{
	public static void main(String[] args) {
	    marks m1=new marks();
	    m1.name="ankit";
	    m1.roll=56;
	    m1.marks1=80;
	    m1.marks2=60;
	    m1.marks3=65;
	    m1.show();
	}
}

Multilevel inheritance:

import java.util.*;
class grand_father
{
    public String hair_color="white";
    public int height=6;
}
class father extends grand_father
{
    public String eyes_color="brown";
}
class son extends father
{
    public String color="wheat";
    public void show()
    {
        System.out.println("The hair color of the grand father is "+hair_color);
        System.out.println("The height of the grand father is "+height+" feet ");
        System.out.println("The eyes color of the father is "+eyes_color);
        System.out.println("The skin color of the son is "+color);
    }
}
public class Main
{
	public static void main(String[] args) {
	    son s=new son();
	    s.show();
	}
}


---------------------------x-------------------------------------x-------------------------
Hierarchical inheritance:

class grandfather
{
    public String name="pratik";
    public int age=82;
    public String profession="a good student";
}
class son1 extends grandfather
{
    public String s1_name="ankit";
    public int s1_age=22;
    public String s1_profession="athlete";
    public void showSon1()
    {
        System.out.println("The name of the grand father of "+s1_name+" is "+name);
        System.out.println("The age of the grand father of "+s1_name+" is "+age);
        System.out.println("The name of the son 1 is "+s1_name);
        System.out.println("The age of the son 1 is "+s1_age);
        System.out.println("The profession of the son 1 is "+s1_profession);
        System.out.println();
    }
}
class daughter1 extends grandfather
{
    public String d1_name="ayushi";
    public int d1_age=20;
    public String d1_profession="coder";
    public void showdaughter1()
    {
        System.out.println("The name of the grand father of "+d1_name+" is "+name);
        System.out.println("The age of the grand father of "+d1_name+" is "+age);
        System.out.println("The name of the daughter 1 is "+d1_name);
        System.out.println("The age of the daughter 1 is "+d1_age);
        System.out.println("The profession of the daughter 1 is "+d1_profession);
        System.out.println();
    }
}
class daughter2 extends grandfather
{
    public String d2_name="payal";
    public int d2_age=20;
    public String d2_profession="sleeping";
    public void showdaughter2()
    {
        System.out.println("The name of the grand father of "+d2_name+" is "+name);
        System.out.println("The age of the grand father of "+d2_name+" is "+age);
        System.out.println("The name of the daughter 2 is "+d2_name);
        System.out.println("The age of the daughter 2 is "+d2_age);
        System.out.println("The profession of the daughter 2 is "+d2_profession);
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
		son1 s1=new son1();
		s1.showSon1();
		daughter1 d1=new daughter1();
		d1.showdaughter1();
		daughter2 d2=new daughter2();
		d2.showdaughter2();
	}
}
