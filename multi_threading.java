class mythr1 extends Thread
{
    public void run()
    {
        int i=1;
        while(i<=40)
        {
            System.out.println("i am chatting and eating "+i);
            i++;
        }
    }
}
class mythr2 extends Thread
{
    public void run()
    {
        int i=1;
        while(i<=40)
        {
            System.out.println("i am reading and dancing "+i);
            i++;
        }
    }
}
class mythr3 extends Thread
{
    public void run()
    {
        int i=1;
        while(i<=40)
        {
            System.out.println("my self baigan "+i);
            i++;
        }
    }
}
public class S_thread
{
	public static void main(String[] args) {
		mythr1 m1=new mythr1();
		mythr2 m2=new mythr2();
        mythr3 m3=new mythr3();
		m1.start();
		m2.start();
        m3.start();
	}
}
