public class SimpleThread extends Thread {
    private String threadName;
    public void run(){
        System.out.println("Running " + threadName);
        try {
            for (int i= 0; i<3; i++){
                System.out.println(threadName +" "+ i);
            }
            System.out.println(threadName + "***********");
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public SimpleThread(String threadName) {
        this.threadName = threadName;
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleThread th1 = new SimpleThread("Vinh");
        SimpleThread th2 = new SimpleThread("Đông");
        SimpleThread th3 = new SimpleThread("Đăng");
        SimpleThread th4 = new SimpleThread("Sơn Mai Công");
        th2.start();
        th4.start();
//        th4.join();

        th1.start();
//        th1.join();

        th3.start();
    }
}
