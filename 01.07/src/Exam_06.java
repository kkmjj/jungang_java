import java.util.StringTokenizer;
import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		String str= "HELLO JAVA";
		String data = "���缮@����@������@�ڸ��";
		
		//���� ��� 
//		StringTokenizer st = new StringTokenizer(data, "@");
//		
//		while(st.hasMoreElements())
//		{
//			System.out.print(st.nextToken());
//		}
		// ���� ��� 
		
		String[] sp = data.split("@");
		for(int i=0;i<sp.length;i++)
		{
			System.out.println(sp[i]);
		}
		
		
		String address ="             ���ﰭ�ϱ�";
		if(address.trim().equals("���ﰭ�ϱ�"))
		{
			System.out.println("���ϱ� ����");
		}
		
		
		
		
		
//	
//		Scanner input = new Scanner(data).useDelimiter("\\s*@\\s*");
//		System.out.println(input.next());
//		System.out.println(input.nextInt());
//		
		
	
		
		
		
		String substr = str.substring(6,10); // ����, ����ġ ���� 
		String sub = str.substring(5); // ������ġ ���� ������ 
		String replace = str.replace(" ",",");
		
		
		
		System.out.println(substr);
		System.out.println(replace);
		System.out.println(sub);
		
		StringBuffer buffer = new StringBuffer(str);
		StringBuilder builder = new StringBuilder(str);
		//str�� ���ۿ� ��´� 	StringBuffer�� ����ȭ ��� ��Ƽ ������ ��� ���� 
		//-> StringBilder �� ���� �����忡���� ���  
		
		
		
		
		buffer.insert(5, ',');
		builder.insert(5, ',');
		System.out.println(buffer);
		//buffer.delete(6, 10);
		//System.out.println(buffer);
		str = new String(buffer);
		System.out.println(str);
		
//		// �ϴ� ���� : ��Ʈ��ũ ��� �ϋ� byte�����θ� ������ �ֱ� ������ �׷� ��쿡 ��� 
//		byte by[] = str.getBytes();
//		for(int i=0;i<by.length;i++)
//		{
//			System.out.print(by[i]);
//		}
//		
//		
//		String str2= new String(by); // byte ���� ������ string���� ���� 
//		
//		
		
		
		
		
		
		
	}
}
