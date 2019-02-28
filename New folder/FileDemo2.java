import java.io.*;
class FileDemo2 {
	public static void main(String args[]) throws Exception{
	DataInputStream dis = new DataInputStream(System.in);
	FileOutputStream fos = new FileOutputStream("abc.txt");	
	System.out.println("Enter the data");
	int ch;
	while((ch=dis.read())!='@') {
		fos.write(ch);
		System.out.print(ch);
		System.out.println((char)ch);
	}
	fos.close();
	}
}