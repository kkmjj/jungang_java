package member;

import java.util.*;

public class MemberProImpl implements MemberPro {
	
	
	Set set;
	Scanner in;
	
	public MemberProImpl() {
		set = new HashSet();
		in = new Scanner(System.in);
		
	}
	
	
	@Override
	public void input() {
		System.out.print("�̸��� �Է� ");
		String name = in.next();
		System.out.print("��ȭ��ȣ �Է� ");
		String tel = in.next();
		Member m = new Member(name,tel);
		set.add(m);
		
	}

	@Override
	public void output() {
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			Member output = (Member)obj;
			System.out.println(output.getName() + " "+output.getTel());
		}
		
	}

	@Override
	public void edit() {
		System.out.print("������ �̸� �Է� ");
		String name = in.next();
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			Member delete = (Member)obj;
			if(name.equals(delete.getName()))
			{
				System.out.print("�ٲ� ��ȣ�� �Է��ϼ��� ");
				String tel = in.next();
				
				delete.setTel(tel);;
				
				
				
				
				return;
			}
		}
		
		System.out.print("ȸ���� �׷���� �����ϴ� ");
		
		
	}

	@Override
	public void delete() {
		System.out.print("������ �̸��� �Է� ");
		String name = in.next();
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			Member delete = (Member)obj;
			if(name.equals(delete.getName()))
			{
				set.remove(delete);
				System.out.print("�����Ǿ����ϴ� ");
				return;
			}
		}
		
		System.out.print("ȸ���� �׷���� �����ϴ� ");
		
	}

	@Override
	public void exit() {
		System.out.println("���α׷� ���� ");
		System.exit(0);
	}
		
	

}
