package test3;

class hari extends Thread
{
    public void run()
    {
        for(int i =0 ; i<5 ;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class giri extends Thread
{
    public void run()
    {
        for(int i =0 ; i<5 ;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class multithreadsByThreadClass {

    public static void main(String[] args)
    {
       /* Thread t= new Thread();
        t.run();*/
       hari h = new hari();
       giri g = new giri();
       h.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       g.start();
    }
}
