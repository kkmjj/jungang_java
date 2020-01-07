import java.io.*;


public class Exam_13 {

	public static void main(String[] args) throws IOException {

		File dir  = new File("C:\\Users\\Administrator\\Desktop\\중앙교육");
		File file = new File(dir,"text01.txt");
		
		FileOutputStream fos = new FileOutputStream(file); // (file,false) 이면 다시 만드는거 
		// (file,true) -> 이어서 작성 가능 
		
		String str = "HELOO";
		
		byte by[] = str.getBytes();
		
		fos.write(by,6,4); // 6번부터 4개 작성 
				
		fos.write('A');
		

	}

}
