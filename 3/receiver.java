import java.net.*;
public class receiver{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);   //Creates a datagram socket and binds it to given port number
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);  //Creates a datagram packet to receive packets
        ds.receive(dp);
        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        ds.close();
    }
}