package session18;


class MultithreadDemo1 extends Thread {
    public void run()
    {
        try {
            // Display the thread that running
            System.out.println("Thread"+ Thread.currentThread().getId()+ "is running");
        }
        catch (Exception e)
        {
            System.out.println("Exception is caught");
        }
    }

}

//Main Class
public class MultithreadDemo {
    public static void main(String[] args) {
        int x = 15; // 5 threads
        for (int i = 0; i < x; i++) {
            MultithreadDemo1 obj = new MultithreadDemo1();
            obj.start();

        }
    }
}
