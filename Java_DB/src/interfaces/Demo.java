package interfaces;


//Interface 는 추상클래스 보다 추상화가 더 심하다 .


public interface Demo {
		public static final double PI = 3.141592;
		
		
		int A=10;
					//고정상수
		
		
		public void print(); // abstract 생략가능 추상메스드 
		
		
		// default 메소드 
		public default void print2() { 
			System.out.println("defalut print2 ");
		}
		
		// static method 
		public static void print3() {
			System.out.println("static print3 ");
		} 
		// 일반 메소드는 불가능 
		
		

}
