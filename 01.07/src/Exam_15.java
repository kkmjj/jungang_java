

import java.io.*;

public class Exam_15 {

	public static void main(String[] args) throws IOException {
		File dir  = new File("C:\\Users\\Administrator\\Desktop\\�߾ӱ���");
		File file = new File(dir,"text02.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos =new BufferedOutputStream(fos);
		
		DataOutputStream dos = new DataOutputStream(bos);
		
		String msg =" �ȳ��ϼ��� ";
		int a =10;
		
		double b= 10.24;
		dos.writeUTF(msg); // ������� ������ ��
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.close();
		
		
		
	}

}
