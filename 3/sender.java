import java.net.*;
public class DSender{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(); //Creates a datagram socket and binds it to port number
        String str = "Hello World";
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000); //Creates a datagram packet to be sent
        ds.send(dp);
        ds.close();
    }
}