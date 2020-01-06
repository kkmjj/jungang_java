package inner;

class Other04{
	public void aaa() {System.out.print("aaa");}
			
	public void bbb() {System.out.print("bbb");}
}



public class test04 {

	public static void main(String[] args)
	{
		Other04 ot = new Other04() {
			public void bbb() {
				System.out.print("ddd");			// 오버라이딩
			}
		};
		
		
		ot.bbb();
	}
	
	
		
	
	
}
