package inner;
// static 중첩 클래스 

import inner.Other01.Inner01;

class Other02 {
	private static int a;
	private static int b;
	
	static {
		b= 20;
	}
	
	 public Other02(){
		a=10;
		
	}
	
	public void disp() {
		System.out.print("a= "+a);
		System.out.print("b= "+b);
	}
	
	static class Inner02{		// other 안에 중첩되어 있는 Inner class 
		private int c;
		
		public Inner02() {
			this.c=30;
		}
		
		public void disp_in() {
			System.out.print("a= "+a); // 밖에 변수라도 static 변수이여야 사용 가능 
			System.out.print("b= "+b);
			System.out.print("c= "+c);
		}
		
		
	}
	
	
	
	
	
	
}



public class test02 {
	
	
	public static void main(String[] args) {
		
		
		
	Other02 cnt = new Other02();
	
	cnt.disp();
	
	// Other01.Inner01 in = new Other01.Inner01(); 중첩 클래스는 new로  생성 하는게 아니다 
	Other02.Inner02 in = new Other02.Inner02();  // static 중첩클래스는 그냥 new 로 생성 가능 (독립적으로 사용가능)
	in.disp_in();
	
	
	
	
	
	
	}
	
	
	
	
	

}


