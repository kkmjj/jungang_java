
interface A09{

	public static final int A =10;	// �������̽��� public static final�� ���� 
	public static int B=20;			// final �ȳ���� �˾Ƽ� final ���� ������ 
	public final int C=30;			// static �� ���������� �ȳ־ �˾Ƽ� ���� 
	
	public int D=40;				// �׳� int ������ ���� �� �˾Ƽ� ���� ������ 
	
	
	public abstract void disp(); // �޼ҵ�� �߻�޼ҵ常 ����  public ���� �ؾ��� 
	
	public void disp3();			// abstract�� �ڵ����� ����� 
	
	
	
	static class Inner{};		// static ��ø Ŭ������ �;��� static ���� ���� 
	
	
	
	
}


public class Exam_09 {

	public static void main(String[] args) {
		System.out.print(A09.A);			//���� ������ ���� static 
		System.out.print(A09.C);	
		
	}

}
