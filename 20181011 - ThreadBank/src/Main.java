public class Main {

    public static void main(String[] args) {
        SimpleBank sb = new SimpleBank();


        Thread t1 = new Thread(new Angestellter(sb, 0, 1, 20));
        Thread t2 = new Thread(new Angestellter(sb, 1, 2, 20));
        Thread t3 = new Thread(new Angestellter(sb, 2, 0, 20));

        sb.kontostand();

        t1.start();
        t2.start();
        t3.start();

        sb.kontostand();
    }

}
