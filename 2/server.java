import java.io.*;
import java.net.*;
import java.util.*;

class server{
	public static void main(String[] args) throws Exception{
	ServerSocket ss=new ServerSocket(3333);
	Socket s=ss.accept();
	DataInputStream din=new DataInputStream(s.getInputStream());
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	Scanner sc=new Scanner(System.in);

	String str1="",str2="";
	while(!str1.equals("stop")){
		str1=din.readUTF();	//Reads from the input stream
		System.out.println("Client: "+str1);
		str2=sc.nextLine();
		dout.writeUTF(str2);	//String written on output stream  
		dout.flush();	//Flushes output stream and forces any buffered output bytes to be written out
	}
	din.close();
	s.close();
	ss.close(); 
	}
}
