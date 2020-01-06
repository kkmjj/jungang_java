
import java.util.*;
abstract class Protoss {
	
//	
//	public void attack() {
//		System.out.print("프로토스가 공격한다");
//	}
	
	 public abstract void attack(); 
	 // 추상메소드   -> 추상메소드 가 한개이상 있으면  그 클래스는 추상 클래스  -> 클래스에도 선언해야함 
										// 상속시 이 함수를 사용 하라는 뜻 
	
	
	
	public void move() {
		System.out.print("프로토스가 움직인다");
	}
	
}

class Zeatlot extends Protoss {
	public void attack() {
		System.out.print("질럿 공격한다");
	}
	
	public void move() {
		System.out.print("질럿  움직인다");
	}
	
}

class Dragon extends Protoss {
	
	public void attack() {
		System.out.print("드라군  공격한다");
	}
	
	public void move() {
		System.out.print("드라군 움직인다");
	}
	
}




public class Exam_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		Protoss pro[] =new Protoss[12];
		
		for(int i=0;i<12;i++) {
		System.out.print("1.질럿 2.드라곤");
		int select1 = input.nextInt();
		System.out.print("1.이동 2.공격");
		int select2 = input.nextInt();
		
		
		if(select1==1) pro[i] = new Zeatlot();
		else			pro[i] = new Dragon();
		
		if(select2==1) pro[i].move();
		else			pro[i].attack();
		
		
		}
		
		
	}
}







