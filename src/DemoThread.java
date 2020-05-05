public class DemoThread implements Runnable {
    private String threadName;
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i= 0; i<3; i++){
                System.out.println(threadName +" "+ i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public DemoThread(String threadName) {
        this.threadName = threadName;
    }

    public static void main(String[] args) {
        DemoThread hieuTran = new DemoThread("Tran Van Hieu");
        DemoThread taThuy = new DemoThread("Ta Thi Thuy");
        DemoThread hoTrung = new DemoThread("Ho Duc Trung");
        Thread thread = new Thread(hieuTran);
        Thread thread1 = new Thread(taThuy);
        Thread thread2 = new Thread(hoTrung);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
