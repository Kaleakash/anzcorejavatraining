import java.io.*;
class FileDemo4 {
	public static void main(String args[]) throws Exception{
	FileInputStream fis = new FileInputStream("CarTest.java");
	BufferedInputStream bis = new BufferedInputStream(fis);
	FileOutputStream fos = new FileOutputStream("demo2.doc",true);
	BufferedOutputStream bos= new BufferedOutputStream(fos);	
	int ch;
	while((ch=bis.read())!=-1) {
		bos.write(ch);
		//fos.write(Character.toUpperCase(ch));
		//System.out.print((char)ch);
	}
	bos.flush();
	fis.close();
	fos.close();
	}
}