package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9090);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(input.readLine());
    }

}
