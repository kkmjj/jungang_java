import java.util.*;

public class Exam_04 {

	public static void main(String[] args) {
		
		
		
		Calendar cal = Calendar.getInstance();
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("�⵵�� �Է� : ");
		int year = input.nextInt();
		
		
		
		System.out.println("�� �Է� : ");
		
		int month = input.nextInt();
		
		//�Է� 
		
		cal.set(year,month-1,1);
		// �ش� ������ �ٲٰ� 
		int week =cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �̴��� ������ ��¥ 
		
	
		//1 2 3 4 5 6 7
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i=1;i<week; i++)
		{
			System.out.print("\t");
			
		}
		for(int i=1;i<=lastDay; i++)
		{
			if(week>7)
			{
				week=1;
				System.out.println();
			}
			System.out.print(i+"\t");
			week++;
		}
		
		
		
		
		
		
		
		
		

	}

}
