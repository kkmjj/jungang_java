import java.io.*;



public class Exam_18 {
	public static void main(String[] args) throws IOException {
		File dir  = new File("C:\\Users\\Administrator\\Desktop\\Áß¾Ó±³À°");
		File file = new File(dir,"text03.txt");
		
		
		
		FileReader fw =new FileReader(file);
		BufferedReader bw = new BufferedReader(fw);
		
		
		while(true)
		{
			String msg = bw.readLine();
			if(msg ==null) break;
			System.out.print(msg);
		}
		
		
	}
}
