import java.io.*;  
import java.net.*;  
public class client {  
	public static void main(String[] args) {  
	try
	{      
		Socket s=new Socket("localhost",6666);  //Instantiates Socket object with String host and int port number
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  //Get the output stream of socket
		dout.writeUTF("Hello Server");  
		dout.flush();  
		dout.close();  
		s.close();  //Closes the socket object
	}
	catch(Exception e)
	{
		System.out.println(e);
	}  
}  
}  