package day06;

import day2.Input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocket {
    //서버로 접속하는 코드

    public static void main(String[] args) {
        Socket clientSocket;

        {
            try {
                clientSocket = new Socket("//ipadrr",9999);
                OutputStream outputStream = clientSocket.getOutputStream();
                outputStream.write(100);

                InputStream inputStream = clientSocket.getInputStream();


                clientSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
