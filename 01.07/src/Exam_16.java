import java.io.*;

public class Exam_16 {
	

	public static void main(String[] args) throws IOException {
		File dir  = new File("C:\\Users\\Administrator\\Desktop\\Áß¾Ó±³À°");
		File file = new File(dir,"text02.txt");
		
		FileInputStream fos = new FileInputStream(file);
		BufferedInputStream bos =new BufferedInputStream(fos);
		
		DataInputStream dos = new DataInputStream(bos);
		
		
		String msg =dos.readUTF();
		int a= dos.readInt();
		double b =dos.readDouble();
		
		
		System.out.print(msg+a+b);
		
		
	}

}
