

import java.io.*;

public class Exam_15 {

	public static void main(String[] args) throws IOException {
		File dir  = new File("C:\\Users\\Administrator\\Desktop\\Áß¾Ó±³À°");
		File file = new File(dir,"text02.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos =new BufferedOutputStream(fos);
		
		DataOutputStream dos = new DataOutputStream(bos);
		
		String msg =" ¾È³çÇÏ¼¼¿ä ";
		int a =10;
		
		double b= 10.24;
		dos.writeUTF(msg); // ¼ø¼­´ë·Î ²¨³»¾ß ÇÔ
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.close();
		
		
		
	}

}
