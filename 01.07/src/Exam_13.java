import java.io.*;


public class Exam_13 {

	public static void main(String[] args) throws IOException {

		File dir  = new File("C:\\Users\\Administrator\\Desktop\\�߾ӱ���");
		File file = new File(dir,"text01.txt");
		
		FileOutputStream fos = new FileOutputStream(file); // (file,false) �̸� �ٽ� ����°� 
		// (file,true) -> �̾ �ۼ� ���� 
		
		String str = "HELOO";
		
		byte by[] = str.getBytes();
		
		fos.write(by,6,4); // 6������ 4�� �ۼ� 
				
		fos.write('A');
		

	}

}
