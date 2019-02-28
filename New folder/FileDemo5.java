import java.io.*;
class FileDemo5 {
	public static void main(String args[]) throws Exception{
	//DataInputStream dis = new DataInputStream(System.in);
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	System.out.println("Enter the name");
	String name  = br.readLine();
	System.out.println("The name is "+name);
	}
}