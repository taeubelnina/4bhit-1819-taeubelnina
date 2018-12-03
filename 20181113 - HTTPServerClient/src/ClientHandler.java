import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable{

    private String filename="Uebung01.html";
    private Socket client;
    private String request="";


    public ClientHandler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        String line="";
        StringBuilder sb = new StringBuilder();
        String ausgabe = "";

        System.out.println("Client connected on " + client.getLocalSocketAddress());

        try(BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())))){
            //Request auslesen, br.read

            while((request=in.readLine())!=null){
                System.out.println(request);

                if(request.isEmpty()){
                    break;
                }
            }



            out.println(filename);
            out.flush();

            try(BufferedReader br = new BufferedReader(new FileReader(filename))){

                while((line=br.readLine())!=null){
                   ausgabe=sb.append(line).toString();
                }
                
                out.println(ausgabe);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
