import java.io.*;

public class Exam_14 {

	public static void main(String[] args) throws IOException {
		File dir  = new File("C:\\Users\\Administrator\\Desktop\\�߾ӱ���");
		File file = new File(dir,"text01.txt");
		
		
		FileInputStream fis = new FileInputStream(file);
		
		while(true)
		{
			int res = fis.read();	// ���Ͽ��� 1byte �� �о�´� .
			 if(res < 0 ) break; // ������ �� //EOF  ==-1 ;
			 
			System.out.print((char)res);
			
		}
		

	}

}
