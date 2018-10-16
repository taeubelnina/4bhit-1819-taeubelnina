public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Count());
        Thread t2 = new Thread(new Time());

        t1.start();
        t2.start();
    }
}
