import java.io.*;

public class Exam_12 {

	public static void main(String[] args) throws IOException {

		File dir  = new File("C:\\Users\\Administrator\\Desktop\\�߾ӱ���");
		File file = new File(dir,"text01.txt");
		
		File imsi =File.createTempFile("temp","txt",dir); // �ӽ÷� ���� ����� 
		
		imsi.deleteOnExit(); // ���α׷� ����� ���� 
		file.delete(); // ���� ���� 
		
		
		if(file.createNewFile())
		{
			System.out.print("text01.txt�� ��������ϴ�.");
		}
		else 
		{
			System.out.print("�̹� �ִ� ���� �Դϴ� .");
		}
		
		
		
	}

}
