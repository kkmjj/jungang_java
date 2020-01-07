package member;

import java.util.*;

public class MemberProImpl3 implements MemberPro {

	ArrayList<Member> list;
	Scanner in;
	
	public MemberProImpl3() {
		list = new ArrayList<Member>();
		in = new Scanner(System.in);
		
	}
	
	
	@Override
	public void input() {
		String name;
		name = in.next();
		String tel;
		tel =in.next();
		
		Member member = new Member(name,tel);
		
		if(list.contains(member))return;
		
		list.add(member);

		
		
		
	}

	@Override
	public void output() {
		
		for(int i=0;i<list.size();i++)
		{
			Member member= list.get(i);
			
			
			System.out.print(member.getName()+" "+member.getTel());
		}
		
	}

	@Override
	public void edit() {
		System.out.print("�������̸�");
		String name = in.next();
		
		for(int i=0;i<list.size();i++)
		{
			Member member =list.get(i);
				
			if(member.getName().equals(name)) 
			{
				System.out.print("�ٲ� ��ȣ ");
				String tel = in.next();
				member.setTel(tel);
				list.remove(i);
				list.add(member);
				
			}
		}
		
	}

	@Override
	public void delete() {
		
		System.out.print("�������̸�");
		String name = in.next();
		
		for(int i=0;i<list.size();i++)
		{
			Member member =list.get(i);
				
			if(member.getName().equals(name)) 
			{
				
				list.remove(i);
				
				
			}
		}
		
		
	}

	@Override
	public void exit() {
		System.out.println("���α׷� ���� ");
		System.exit(0);
		
	}
	
	

}
