import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Runnable {

    public Time() {
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss, dd. MMMM YYYY");
        String zeit;

        for (int i = 0; i <20 ; i++) {
            zeit = sdf.format(new Date());
            System.out.println(zeit + "\n");
            try{
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
