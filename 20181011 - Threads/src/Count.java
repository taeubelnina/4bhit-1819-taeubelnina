public class Count implements Runnable {

    public Count() {
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + "\n");
            try{
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
