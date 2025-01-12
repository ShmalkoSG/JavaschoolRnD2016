package ru.sbertech.test.Lesson15.Second;

import java.io.*;
import java.net.Socket;

/**
 * Created by Student on 29.08.2016.
 */
public class MyClient {
    public static final String HOST = "localhost";
    public static final int PORT = 3333;
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(HOST,PORT);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        System.out.println(bufferedReader.readLine());
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        String answer;
        while (true) {
            if((answer = consoleReader.readLine())!=null){
                bufferedWriter.write(answer);
                bufferedWriter.write("\n");
                bufferedWriter.flush();

                String fromServer = bufferedReader.readLine();
                System.out.println(fromServer);
                if (fromServer.equals("Угадал")){
                    break;
                }
            }
        }
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}