package session18;

class RunnableTest implements Runnable
{
    private Thread t;
    private String threadName;

    RunnableTest(String name)
    {
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try
        {
            for (int i = 4; i >0; i--) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(60);
            }
        } catch (InterruptedException e) {
            System.out.println("Creating " + threadName + " interrupted..");
        }
        System.out.println("Thread " + threadName + "existing...");
    }
    public void start()
    {
        System.out.println("Strating " + threadName);
        if (t == null) {
            t = new Thread(this.threadName);
            t.start();
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        RunnableTest objR = new RunnableTest("Thread Count 1");
        objR.start();

        RunnableTest objR1 = new RunnableTest("Thread Count 2");
        objR.start();
    }
}
