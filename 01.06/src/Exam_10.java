

// set�� ��� �ǹ̸� ������ ���                      Map�� ���� key value ���� ���� ���                    List  ���� �ְ� ���� ���� 
// collection -> set , Map , List  -> ������ �������� ����   -> ��� interface�� ���� ����  �׷��� ��ü�� ���� ���� ��� �޾Ƽ� ����ؾ��� 

// set -> Hashset , TreeSet ���� �����ϸ�� 



// Hashset 


import java.util.*; // �� �ȿ� HashSet ���� 


public class Exam_10 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();		// HashSet set =new HashSet(���ϴ� ũ�� �̸� ũ�� ���� ���� , ������ �ڵ����� ���ۼ�Ʈ �Ǹ� �ٽ� ���� �ϴ� �ۼ�Ʈ ���� ��������);
		
		set.add("ȫ�浿"); // ������ �ֱ� 
		System.out.println(set);
		System.out.println(set.size());
		
		set.clear();  // set.remove("ȫ�浿") ���ϴ� �� �����  �ش簪�� ������ �������� ������ false ��ȯ 
		System.out.println(set);
		set.add("ȫ�浵");
		set.add("rla");
		set.remove("ȫ�浵");
		System.out.println(set);
		
		if(set.contains("rla")) System.out.println(set);		// ���� ���� �Ǵ� 
		else System.out.println("�������� �ʽ��ϴ�");
		
		
		set.add("ȫ�浵");
		set.add("��ȣ��");
		
		
		Object[] data = new Object[set.size()];
		
		set.toArray(data); // set�� �ִ� ��� ���� data�� �־�� 
		
		
		
		Iterator it = set.iterator();		// �����͸� ������ ��� �ϴ� ��� 
		while(it.hasNext())
		{
			Object obj = it.next(); 		// ��ĳ���� Ÿ���� �𸣴� Object�� �޾Ƴ��� 
			String data = (String)obj;		// string���� �˰� ������ �ٿ� ĳ���� 
			System.out.println(data);
		}

	}

}
