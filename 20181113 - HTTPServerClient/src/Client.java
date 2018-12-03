import java.io.*;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String file="";
        String tmp="";
        String i="";
        String array[];

        try(Socket server = new Socket(Inet4Address.getLocalHost().getHostAddress(), 8080);
            BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(server.getOutputStream())))){

            if(server.isConnected()){
                file = sc.nextLine();
                out.write(file);

                while((tmp=in.readLine())!=null){
                     i= i+tmp;
                }

                array=i.split("\t");

                for (String elem: array) {
                    System.out.println(elem);
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
