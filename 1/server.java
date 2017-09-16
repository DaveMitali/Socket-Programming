import java.io.*;
import java.net.*;
public class server{
	public static void main(String[] args) {
	try
	{
		ServerSocket ss=new ServerSocket(6666); //Instantiates a ServerSocket object denoting port number for communication(here, 6666)
		Socket s=ss.accept(); //Socket class's method accept will establish a connection (client connects to server on given port)
		DataInputStream din=new DataInputStream(s.getInputStream()); //Get the input stream of socket
		String str=(String)din.readUTF();
		System.out.println("message= "+str);
		ss.close(); //Closes the ServerSocket object
	}
	catch(Exception e)
	{
		System.out.println(e);
	}	
	}
}
/*  Client's OutputStream is connected to server's InputStream.
	Server's OutputStream is connected to client's InputStream. 
	Try-catch used because ServerSocket can throw IOException if port is bound to another application. 
	Socket class  implements one side of a two-way connection between your Java program and another program on the network. 	
	ServerSocket class implements a socket that servers can use to listen for and accept connections to clients.
*/