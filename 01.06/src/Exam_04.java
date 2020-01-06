
class A04{
		int a;
		int b;
		public A04() {
			a=10;
			b=20;
		}
		
		public A04(int a, int b) {
			this.a=a;
			this.b=b;
		}
		
		
	}
	
	
	class B04 extends A04 {
		int c;
		public B04(){
			//super(); // 생략 가능 
			c=30;
			b=10000;
			
		}
		public void disp2() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			
		}
	}

public class Exam_04 {

	
	
	
	
	public static void main(String[] args) {
		B04 b04 = new B04();
		
		b04.disp2();

	}

}
