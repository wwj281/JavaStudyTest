package 网络编程;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class socketTest {
    @Test
    public void Test1() throws IOException {
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(inet, 8899);
        OutputStream os = socket.getOutputStream();
        os.write("你好，哈哈哈".getBytes(StandardCharsets.UTF_8));
        os.close();
        socket.close();
    }

    @Test
    public void Test2() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8899);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len;
        while((len = inputStream.read(buffer)) != -1){
            String str = new String(buffer,0,len);
            System.out.print(str);
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
