import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) throws IOException {

        System.out.println("Client: running");

        /*try (Socket server = new Socket("localhost", 1234);
             BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
             PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(server.getOutputStream())));) {

            System.out.println("Client: sending data");
            System.out.println("2");
            System.out.println("4");
            System.out.println("Client: receiving data");
            System.out.println(in.readLine());
            System.out.println("Client: data received");
           */

            try (Socket server = new Socket("localhost", 1234);
                 DataInputStream in = new DataInputStream(new BufferedInputStream(server.getInputStream()));
                 DataOutputStream out = new DataOutputStream(new BufferedOutputStream(server.getOutputStream()))) {

            out.writeInt(2);
            out.writeInt(4);
            out.flush();
            System.out.println(in.readInt());


        }catch(UnknownHostException e){
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }
    }
}
