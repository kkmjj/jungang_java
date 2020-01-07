import java.util.*;

public class Exam_04 {

	public static void main(String[] args) {
		
		
		
		Calendar cal = Calendar.getInstance();
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("년도을 입력 : ");
		int year = input.nextInt();
		
		
		
		System.out.println("달 입력 : ");
		
		int month = input.nextInt();
		
		//입력 
		
		cal.set(year,month-1,1);
		// 해당 값으로 바꾸고 
		int week =cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 이달의 마지막 날짜 
		
	
		//1 2 3 4 5 6 7
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
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
