package inherit;

public class Child2 extends Parent{

	int childVar=20;
	void childMethod() {
		System.out.println("childMethod");
	}
	
	
	// 오버라이드 재정의 
	@Override
	void parentMethod() {
			System.out.println("parentMethod -override");
	}
	int paraentVar=20;
	
	
	
}
