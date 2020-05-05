public class AnonymousThread {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("Running Long" );
                try {
                    for (int i= 0; i<3; i++){
                        System.out.println( "Long DT "+ i);
                        Thread.sleep(1000);
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        }.start();
    }
}
