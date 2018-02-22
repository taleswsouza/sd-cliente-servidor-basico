package servidor;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Servidor {

    public static void main(String[] args) throws IOException {
        try (ServerSocket listen = new ServerSocket(9090)) {
            while (true) {
                try (Socket socket = listen.accept()) {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Date().toString());
//            out.println("HTTP/1.0 404 Not Found");
                    System.out.println("Serviu a hora");
//                socket.close();
                }
            }
        }
    }

}
