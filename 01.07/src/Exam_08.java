import java.util.*;

class MySubException extends Exception{
	String message;
	public MySubException(String sub)
	{
		super(sub);
	}
	public String getMessage() {
		message = super.getMessage()+"������ �������� ������";
		return message;
	}
}


public class Exam_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("�������� �Է� :");
			int kor = input.nextInt();
			if(kor<0 || kor >100) throw new MySubException("����");
			
			System.out.print(kor+"�����Դϴ�.");
		}
		catch(MySubException e)
		{
			System.out.print(e.getMessage());
		}catch(InputMismatchException e)	// �Է� �ڷ����� Ʋ���� ���ڰ� �ƴҶ� 
		{
			System.out.print("���� ������ ���� ���� �Է��ϼ��� ");
		}
		finally { // try���� ������ �ٷ� ȣ��  catch �� try������ ���� �߻��� try ���� ��Ű�� catch�� 
			System.out.println("���������� �Է¹޾� ����ϴ� ���α׷�");
		}
		

	}

}
