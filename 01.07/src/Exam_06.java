import java.util.StringTokenizer;
import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		String str= "HELLO JAVA";
		String data = "유재석@하하@정형돈@박명수";
		
		//옛날 방식 
//		StringTokenizer st = new StringTokenizer(data, "@");
//		
//		while(st.hasMoreElements())
//		{
//			System.out.print(st.nextToken());
//		}
		// 지금 방식 
		
		String[] sp = data.split("@");
		for(int i=0;i<sp.length;i++)
		{
			System.out.println(sp[i]);
		}
		
		
		String address ="             서울강북구";
		if(address.trim().equals("서울강북구"))
		{
			System.out.println("강북구 적용");
		}
		
		
		
		
		
//	
//		Scanner input = new Scanner(data).useDelimiter("\\s*@\\s*");
//		System.out.println(input.next());
//		System.out.println(input.nextInt());
//		
		
	
		
		
		
		String substr = str.substring(6,10); // 시작, 끝위치 다음 
		String sub = str.substring(5); // 시작위치 부터 끝까지 
		String replace = str.replace(" ",",");
		
		
		
		System.out.println(substr);
		System.out.println(replace);
		System.out.println(sub);
		
		StringBuffer buffer = new StringBuffer(str);
		StringBuilder builder = new StringBuilder(str);
		//str을 버퍼에 담는다 	StringBuffer는 동기화 사용 멀티 쓰레드 사용 가능 
		//-> StringBilder 는 단일 쓰레드에서만 사용  
		
		
		
		
		buffer.insert(5, ',');
		builder.insert(5, ',');
		System.out.println(buffer);
		//buffer.delete(6, 10);
		//System.out.println(buffer);
		str = new String(buffer);
		System.out.println(str);
		
//		// 하는 이유 : 네트워크 통신 일떄 byte단위로만 보낼수 있기 때문에 그럴 경우에 사용 
//		byte by[] = str.getBytes();
//		for(int i=0;i<by.length;i++)
//		{
//			System.out.print(by[i]);
//		}
//		
//		
//		String str2= new String(by); // byte 형식 받은걸 string으로 복구 
//		
//		
		
		
		
		
		
		
	}
}
