import java.io.*;

public class Exam_12 {

	public static void main(String[] args) throws IOException {

		File dir  = new File("C:\\Users\\Administrator\\Desktop\\중앙교육");
		File file = new File(dir,"text01.txt");
		
		File imsi =File.createTempFile("temp","txt",dir); // 임시로 파일 만들기 
		
		imsi.deleteOnExit(); // 프로그램 종료시 삭제 
		file.delete(); // 파일 삭제 
		
		
		if(file.createNewFile())
		{
			System.out.print("text01.txt를 만들었습니다.");
		}
		else 
		{
			System.out.print("이미 있는 파일 입니다 .");
		}
		
		
		
	}

}
