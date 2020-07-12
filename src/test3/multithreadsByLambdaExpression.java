package test3;

public class multithreadsByLambdaExpression {

    public static void main(String[] args) {
        Runnable obj1 = () ->
        {
                for (int i = 0; i < 5; i++) {
                    System.out.println("ten");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        Runnable obj2 = () ->
        {
                for (int i = 0; i < 5; i++) {
                    System.out.println("two");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
            Thread.sleep(10);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
