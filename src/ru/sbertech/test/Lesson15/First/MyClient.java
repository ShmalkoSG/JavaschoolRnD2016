package ru.sbertech.test.Lesson15.First;

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
        bufferedWriter.write("Hello");
        bufferedWriter.write("\n");
        bufferedWriter.flush();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        System.out.println(bufferedReader.readLine());

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}