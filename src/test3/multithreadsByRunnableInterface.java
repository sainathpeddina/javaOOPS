package test3;

class ten implements Runnable
{
    public void run()
    {
        for(int i =0 ; i<5 ;i++)
        {
            System.out.println("ten");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class two implements Runnable
{
    public void run()
    {
        for(int i =0 ; i<5 ;i++)
        {
            System.out.println("two");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multithreadsByRunnableInterface {

    public static void main(String[] args)
    {

       ten h = new ten();
       two g = new two();
        Thread t1= new Thread(h);
        Thread t2= new Thread(g);
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
