package day06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        Socket clientSocket;
        try {

            clientSocket = new Socket("//ipadrr",9999);

            InputStream is = clientSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String msg1 = br.readLine();
            System.out.println("서버로부터 수신한 메세지");
            System.out.println(msg1);


            OutputStream os = clientSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            System.out.println("서버에게 전송할 메세지를 입력하세요");
            Scanner scanner = new Scanner(System.in);
            String msg = scanner.nextLine();

            bw.write(msg + "\n");
            bw.flush();

            clientSocket.close();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
