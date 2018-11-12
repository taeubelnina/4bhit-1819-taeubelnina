import java.io.*;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(1234)){
            System.out.println("Server: started");

            while(true){

                try(Socket client = serverSocket.accept()){
                    System.out.println("Server: Client connected");
                    handleConnection(client);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void handleConnection(Socket client) throws IOException {

        String z1, z2;

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream());

        System.out.println("Server: waiting for data...");

        z1=in.readLine();
        z2=in.readLine();

       System.out.println("Ergebnis: ");
       out.println(Integer.parseInt(z1) * Integer.parseInt(z2));
   }

}
