package member;

import java.util.*;

public class MemberProImpl2 implements MemberPro {

	Map map;
	Scanner in;
	
	public MemberProImpl2() {
		map = new Hashtable();
		in = new Scanner(System.in);
		
	}
	
	
	@Override
	public void input() {
		String name;
		name = in.next();
		
		if(map.containsKey(name)) {
			String tel;
			tel =in.next();
			map.put(name,tel);
		}
		else 
		{
			System.out.print("�����մϴ�");
			return;
		}
		

		
		
		
	}

	@Override
	public void output() {
		Set set = map.keySet(); // key���� set ���·� �����ִ� �޼ҵ� 
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			String key =(String)obj;
			Member output = (Member)map.get(key);
			System.out.print(output.getName()+" "+output.getTel());
		}
		
		
	}

	@Override
	public void edit() {
		System.out.print("�������̸�");
		String name = in.next();
		
		if(map.containsKey(name)) {
			Member edit =(Member)map.get(name);
			System.out.print("������ ��ȣ ");
			String tel = in.next();
			edit.setTel(tel);
		}
		else System.out.print("�����ϴ� ȸ�� �ƴ� ");
		
	}

	@Override
	public void delete() {
		System.out.print("����");
		String name = in.next();
		
		if(map.containsKey(name)) map.remove(name);
		else System.out.print("�����ϴ� ȸ�� �ƴ� ");
		
	}

	@Override
	public void exit() {
		System.out.println("���α׷� ���� ");
		System.exit(0);
		
	}
	
	

}
