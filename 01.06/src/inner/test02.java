package inner;
// static ��ø Ŭ���� 

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
	
	static class Inner02{		// other �ȿ� ��ø�Ǿ� �ִ� Inner class 
		private int c;
		
		public Inner02() {
			this.c=30;
		}
		
		public void disp_in() {
			System.out.print("a= "+a); // �ۿ� ������ static �����̿��� ��� ���� 
			System.out.print("b= "+b);
			System.out.print("c= "+c);
		}
		
		
	}
	
	
	
	
	
	
}



public class test02 {
	
	
	public static void main(String[] args) {
		
		
		
	Other02 cnt = new Other02();
	
	cnt.disp();
	
	// Other01.Inner01 in = new Other01.Inner01(); ��ø Ŭ������ new��  ���� �ϴ°� �ƴϴ� 
	Other02.Inner02 in = new Other02.Inner02();  // static ��øŬ������ �׳� new �� ���� ���� (���������� ��밡��)
	in.disp_in();
	
	
	
	
	
	
	}
	
	
	
	
	

}


