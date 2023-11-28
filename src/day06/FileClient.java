package day06;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class FileClient {
    public static void main(String[] args) {
        Socket clientSocket;
        try {
            clientSocket = new Socket("//ipadrr",9999);
            //파일 이름 입력
            OutputStream os = clientSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            System.out.println("파일명을 입력하세요");
            Scanner scanner = new Scanner(System.in);
            String msg = scanner.nextLine();

            bw.write(msg + "\n");
            bw.flush();
            FileOutputStream fileOutputStream = new FileOutputStream("c:\\test\\"+msg+"get.txt");

            InputStream is = clientSocket.getInputStream();
            //BufferedInputStream
            byte[] bytes = is.readAllBytes();

            for (int i = 0; i < bytes.length; i++) {
                fileOutputStream.write(bytes[i]);
            }

            is.close();
            bw.close();
            clientSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}
