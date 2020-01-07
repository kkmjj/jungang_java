import java.util.*;

class MySubException extends Exception{
	String message;
	public MySubException(String sub)
	{
		super(sub);
	}
	public String getMessage() {
		message = super.getMessage()+"점수가 범위에서 벗어났어요";
		return message;
	}
}


public class Exam_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("국어점수 입력 :");
			int kor = input.nextInt();
			if(kor<0 || kor >100) throw new MySubException("국어");
			
			System.out.print(kor+"점수입니다.");
		}
		catch(MySubException e)
		{
			System.out.print(e.getMessage());
		}catch(InputMismatchException e)	// 입력 자료형이 틀릴때 문자가 아닐때 
		{
			System.out.print("국어 점수는 정수 값만 입력하세요 ");
		}
		

	}

}
