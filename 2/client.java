import java.io.*;
import java.net.*;
import java.util.Scanner;

class client{
    public static void main(String args[]) throws Exception{
        Socket s=new Socket("localhost",3333);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        String str1="",str2="";
        while(!str1.equals("stop")){
            sc.nextLine();
            str1=sc.nextLine();
            dout.writeUTF(str1);
			dout.flush();
	        str2=din.readUTF();
            System.out.println("Server:"+str2);
        }
        dout.close();
        s.close();
    }
}