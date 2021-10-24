package 网络编程;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPTest3 {
    @Test
    public void Test1() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 1234);
        FileInputStream fr = new FileInputStream(new File("beauty.jpg"));
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int len;
        byte[] bytes = new byte[1024];
        while((len=fr.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        char[] chars = new char[1024];
        while((len=isr.read(chars))!=-1){
            for(int i =0;i<len;i++){
                System.out.print(chars[i]);
            }
        }
        fr.close();
        isr.close();
        socket.close();
    }

    @Test
    public void Test2() throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket accept = serverSocket.accept();
        FileOutputStream fos = new FileOutputStream(new File("beauty1.jpg"));
        InputStream is = accept.getInputStream();
        OutputStream os = accept.getOutputStream();
        int len;
        byte[] bytes = new byte[1024];
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        System.out.println("数据接收成功");
        os.write("已接受到数据".getBytes(StandardCharsets.UTF_8));
        os.flush();
        fos.close();
        is.close();
        accept.close();
        serverSocket.close();
    }
}
