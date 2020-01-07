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
		System.out.print("이름을 입력 ");
		String name = in.next();
		System.out.print("전화번호 입력 ");
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
		System.out.print("수정할 이름 입력 ");
		String name = in.next();
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			Member delete = (Member)obj;
			if(name.equals(delete.getName()))
			{
				System.out.print("바꿀 번호를 입력하세요 ");
				String tel = in.next();
				
				delete.setTel(tel);;
				
				
				
				
				return;
			}
		}
		
		System.out.print("회원에 그런사람 없습니다 ");
		
		
	}

	@Override
	public void delete() {
		System.out.print("삭제할 이름을 입력 ");
		String name = in.next();
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			Member delete = (Member)obj;
			if(name.equals(delete.getName()))
			{
				set.remove(delete);
				System.out.print("삭제되었습니다 ");
				return;
			}
		}
		
		System.out.print("회원에 그런사람 없습니다 ");
		
	}

	@Override
	public void exit() {
		System.out.println("프로그램 종료 ");
		System.exit(0);
	}
		
	

}
