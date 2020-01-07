import java.io.*;


public class Exam_17 {

	public static void main(String[] args) throws IOException {
		File dir  = new File("C:\\Users\\Administrator\\Desktop\\중앙교육");
		File file = new File(dir,"text03.txt");
		
		
		
		FileWriter fw =new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕하세요");
		pw.println("텍스트 형식으로 저장입니다 ");
		
		pw.close();
		
		
		
	}
}
