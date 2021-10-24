package 网络编程;

import HelloWorld.F;
import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPTest2 {

    @Test
    public void Test1() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 1234);
        FileInputStream fr = new FileInputStream(new File("beauty.jpg"));
        OutputStream os = socket.getOutputStream();
        int len;
        byte[] bytes = new byte[1024];
        while((len=fr.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        os.close();
        fr.close();
        socket.close();
    }

    @Test
    public void Test2() throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket accept = serverSocket.accept();
        FileOutputStream fos = new FileOutputStream(new File("beauty1.jpg"));
        InputStream is = accept.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        is.close();
        accept.close();
        serverSocket.close();
    }
}
