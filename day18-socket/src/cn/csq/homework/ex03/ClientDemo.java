package cn.csq.homework.ex03;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.List;


public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",10000);

        byte[] bytes = FileUtils.readFileToByteArray(new File("day18-socket\\io\\a.jpg"));

        IOUtils.write(bytes, socket.getOutputStream());
        socket.shutdownOutput();
        List<String> strings = IOUtils.readLines(socket.getInputStream());
        for (String string : strings) {
            System.out.println(string);
        }

        socket.close();
    }

}
