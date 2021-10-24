package IO流.缓冲流;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

public class UDPTest {
    @Test
    public void send() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String str = "UDP网络编程";
        byte[] bytes = str.getBytes();
        InetAddress localHost = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, localHost, 9090);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }

    @Test
    public void receive() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9090);
        byte[] bytes = new byte[100];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        datagramSocket.close();
    }
}
