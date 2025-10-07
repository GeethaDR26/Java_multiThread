public class T_thread extends Thread {
    public void run() {
        System.out.println("1st thread is running");
    }

    public static void main(String[] args) {
        T_thread t1 = new T_thread();
        t1.start();

        Thread t2 = new Thread(() ->
        {
            System.out.println("2nd thread is running");
        });
        t2.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("3rd thread is running");
            }
        };
        Thread t3 = new Thread(r1, "Runnable thread");
        t3.start();
    }
}
