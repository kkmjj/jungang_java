package inner;

class Other01 {
	private int a;
	private static int b;
	
	static {
		b= 20;
	}
	
	 public Other01(){
		a=10;
		
	}
	
	public void disp() {
		System.out.print("a= "+a);
		System.out.print("b= "+b);
	}
	
	class Inner01{		// other 안에 중첩되어 있는 Inner class 
		private int c;
		
		public Inner01() {
			this.c=30;
		}
		
		public void disp_in() {
			System.out.print("a= "+a);
			System.out.print("b= "+b);
			System.out.print("c= "+c);
		}
		
		
	}
	
	
	
	
	
	
}
public class test01 {
	
	
	public static void main(String[] args) {
		
		
		
	Other01 cnt = new Other01();
	
	cnt.disp();
	
	
	
	
	
	}
	
	
	
	
	

}
