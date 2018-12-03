import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        System.out.println("Client running");

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try (Socket server = new Socket("localhost", 1234);
                     DataInputStream in = new DataInputStream(new BufferedInputStream(server.getInputStream()));
                     DataOutputStream out = new DataOutputStream(new BufferedOutputStream(server.getOutputStream()))) {

                    String text = null;
                    System.out.println("Nachricht: ");

                    text = in.readUTF();

                    out.writeUTF(text);
                    out.flush();
                    System.out.print(text + server.getLocalSocketAddress());


                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };

        ExecutorService ex = Executors.newCachedThreadPool();

        ex.execute(r1);

        ex.shutdown();

    }
}
