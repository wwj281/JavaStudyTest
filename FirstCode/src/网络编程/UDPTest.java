package 网络编程;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPTest {
    @Test
    public void client(){
        DatagramSocket ds = null;
        try {
            //创建UDP协议对象
            ds = new DatagramSocket(10001);
            //创建需要发送的UDP数据对象，传入对应的数据缓存区，并指定传输目标的IP地址及端口号
            byte[] by1 = "发送数据".getBytes();
            DatagramPacket dp1 = new DatagramPacket(by1, 0, by1.length,
                    InetAddress.getByName("100.66.204.252"), 10000);
            //通过UDP协议对象发送数据
            ds.send(dp1);
            //创建用于接收数据的UDP数据对象，只需传入对应的数据缓存区，不需要再指定IP地址及端口号
            byte[] by2 = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(by2, by2.length);
            //通过UDP协议接受数据
            ds.receive(dp2);
            String str = new String(dp2.getData(), 0, dp2.getLength());
            //将接收到的数据打印到控制台上
            System.out.println(str + "--" + dp2.getAddress());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ds != null)
                //关闭UDP协议对象
                ds.close();
        }
    }

    @Test
    public void server(){
        DatagramSocket ds = null;
        try {
            //创建UDP协议对象
            ds = new DatagramSocket(10000);
            byte[] by = new byte[1024];
            //创建用于接收数据的UDP数据对象，只需传入对应的数据缓存区，不需要再指定IP地址及端口号
            DatagramPacket dp = new DatagramPacket(by, by.length);
            //通过UDP协议接受数据
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            //将接收到的数据打印到控制台上
            System.out.println(str + "--" + dp.getAddress());
            byte[] by1 = "已收到数据".getBytes();
            //创建需要发送的UDP数据对象，传入对应的数据缓存区，并指定传输目标的IP地址及端口号
            DatagramPacket dp1 = new DatagramPacket(by1, 0, by1.length,
                    InetAddress.getByName("100.66.204.252"), 10001);
            //通过UDP协议对象发送数据
            ds.send(dp1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ds != null)
                ds.close();
        }
    }
}
