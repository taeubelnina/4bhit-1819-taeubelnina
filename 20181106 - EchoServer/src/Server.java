import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server auf " + serverSocket.getLocalSocketAddress() + " started");

            while (true) {

                try (Socket client = serverSocket.accept()) {
                    System.out.println("Client connected");
                    try (DataInputStream in = new DataInputStream(new BufferedInputStream(client.getInputStream()));
                         DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()))) {

                        System.out.println("Server waiting for data");
                        String text = in.readUTF();
                        System.out.println(text);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
