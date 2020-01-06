import java.util.*;
// 상속 
class A03 extends Object { // 기본적으로 exteds Object 이다  생략 가능 
	
	public String toString() {			// 오버라이딩 object가 이미 toString을 가지고 있는데 이렇게 직접 만들어서 사용하는거 권장 
		return "상속공부중";
	}
	
}

/*
 class 사람 {
 
 
 }
 
 class 학생 extends 사람 {		// 상속 관계 
 	String 학교 ;	
 }
 
 class 경찰 extends 사람 {		//포함관계
 
 	학생 st= new 학생():;
 }
 
 
 
 */

public class Exam_03 {

	public static void main(String[] args) {
			
		A03 a = new A03();
		
		System.out.print(a.getClass());
		System.out.println(a.toString());
		System.out.print(a);

	}

}
