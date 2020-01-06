
interface A09{

	public static final int A =10;	// 인터페이스는 public static final만 가능 
	public static int B=20;			// final 안넣으어도 알아서 final 적용 시켜줌 
	public final int C=30;			// static 도 마찬가지로 안넣어도 알아서 적용 
	
	public int D=40;				// 그냥 int 형으로 만들어도 다 알아서 적용 시켜줌 
	
	
	public abstract void disp(); // 메소드는 추상메소드만 가능  public 으로 해야함 
	
	public void disp3();			// abstract가 자동오르 적용됨 
	
	
	
	static class Inner{};		// static 중첩 클래스만 와야함 static 생략 가능 
	
	
	
	
}


public class Exam_09 {

	public static void main(String[] args) {
		System.out.print(A09.A);			//접근 가능한 이유 static 
		System.out.print(A09.C);	
		
	}

}
