import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("A1" + Thread.currentThread());
                System.out.println("A2" + Thread.currentThread());
            }
        };

        Runnable r2 = new Runnable() { //Lambda-Expression Runnable r2 = (steht für Argumente) -> {

            @Override
            public void run() {
                System.out.println("B1" + Thread.currentThread());
                System.out.println("B2" + Thread.currentThread());

                /*try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        };

        ExecutorService ex = Executors.newCachedThreadPool();

        ex.execute(r1);
        ex.execute(r2);

        Thread.sleep(500);

        ex.execute(r1);
        ex.execute(r2);

        ex.shutdown();
    }
}
