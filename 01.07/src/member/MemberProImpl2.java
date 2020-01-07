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
			System.out.print("존재합니다");
			return;
		}
		

		
		
		
	}

	@Override
	public void output() {
		Set set = map.keySet(); // key값을 set 형태로 돌려주는 메소드 
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
		System.out.print("수정할이름");
		String name = in.next();
		
		if(map.containsKey(name)) {
			Member edit =(Member)map.get(name);
			System.out.print("수정할 번호 ");
			String tel = in.next();
			edit.setTel(tel);
		}
		else System.out.print("존재하는 회원 아님 ");
		
	}

	@Override
	public void delete() {
		System.out.print("삭제");
		String name = in.next();
		
		if(map.containsKey(name)) map.remove(name);
		else System.out.print("존재하는 회원 아님 ");
		
	}

	@Override
	public void exit() {
		System.out.println("프로그램 종료 ");
		System.exit(0);
		
	}
	
	

}
