package interfaces;

public class Demoimpl implements Demo {
	
	double PI=4;

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("print 오버라이딩");
		
		
		

	}
	
	// default 메소드는 재정의가 가능하다 
@Override
	public void print2() {
	
		System.out.println("default 메소드 재정의했다 ");
	}	
	
	
	
	
	
	// 일반 메소드 가능
	
	public void  write() {
		
		System.out.println(A);
		
		
	}
	
	
	
	

}
