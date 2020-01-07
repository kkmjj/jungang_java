import java.io.*;

public class Exam_14 {

	public static void main(String[] args) throws IOException {
		File dir  = new File("C:\\Users\\Administrator\\Desktop\\중앙교육");
		File file = new File(dir,"text01.txt");
		
		
		FileInputStream fis = new FileInputStream(file);
		
		while(true)
		{
			int res = fis.read();	// 파일에서 1byte 씩 읽어온다 .
			 if(res < 0 ) break; // 파일의 끝 //EOF  ==-1 ;
			 
			System.out.print((char)res);
			
		}
		

	}

}
