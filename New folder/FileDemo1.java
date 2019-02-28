import java.io.*;
class FileDemo1 {
	public static void main(String args[]) throws Exception{
	DataInputStream dis = new DataInputStream(System.in);
	
	PrintStream ps = System.out;
	ps.println("Ener the id");
	
	int id = Integer.parseInt(dis.readLine());

	ps.println("Enter the name");
	
	String name = dis.readLine();
	
	ps.println("The id is "+id);
	ps.println("The name is "+name);

	
	//System.out.println("Enter the value");
	}
}