package member;

import java.util.*;
public class MemberMain {
	
	public static void main(String[] args) {
	
		Scanner input =new Scanner (System.in);
		
		
		MemberPro pro = new MemberProImpl();
		
		
		while(true)
		{
			System.out.print("1.입력 2. 출력 3 수정  4 삭제 5 종료 ");
			int select = input.nextInt();
			
			switch(select)
			{
				case 1 : pro.input(); break;
				case 2 : pro.output(); break;
				case 3 : pro.edit(); break;
				case 4 : pro.delete(); break;
				case 5 : pro.exit(); break;
				default:System.out.print("잘못 입력");
				
			}
			
			
		}
	}

}
