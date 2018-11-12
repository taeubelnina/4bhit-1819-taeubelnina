import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    private static BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();

    }







}
