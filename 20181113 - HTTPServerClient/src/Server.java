import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) throws IOException {
        Socket client;
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started");

            Executor ex = Executors.newCachedThreadPool();

            while (true) {
                try{
                   if( (client = serverSocket.accept())!=null) {
                       ClientHandler ch = new ClientHandler(client);
                       Thread t = new Thread(ch);

                       ex.execute(t);
                   }
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        }
    }
}



