import java.io.*;


public class Exam_17 {

	public static void main(String[] args) throws IOException {
		File dir  = new File("C:\\Users\\Administrator\\Desktop\\�߾ӱ���");
		File file = new File(dir,"text03.txt");
		
		
		
		FileWriter fw =new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("�ȳ��ϼ���");
		pw.println("�ؽ�Ʈ �������� �����Դϴ� ");
		
		pw.close();
		
		
		
	}
}
