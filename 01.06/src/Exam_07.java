
import java.util.*;
abstract class Protoss {
	
//	
//	public void attack() {
//		System.out.print("�����佺�� �����Ѵ�");
//	}
	
	 public abstract void attack(); 
	 // �߻�޼ҵ�   -> �߻�޼ҵ� �� �Ѱ��̻� ������  �� Ŭ������ �߻� Ŭ����  -> Ŭ�������� �����ؾ��� 
										// ��ӽ� �� �Լ��� ��� �϶�� �� 
	
	
	
	public void move() {
		System.out.print("�����佺�� �����δ�");
	}
	
}

class Zeatlot extends Protoss {
	public void attack() {
		System.out.print("���� �����Ѵ�");
	}
	
	public void move() {
		System.out.print("����  �����δ�");
	}
	
}

class Dragon extends Protoss {
	
	public void attack() {
		System.out.print("���  �����Ѵ�");
	}
	
	public void move() {
		System.out.print("��� �����δ�");
	}
	
}




public class Exam_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		Protoss pro[] =new Protoss[12];
		
		for(int i=0;i<12;i++) {
		System.out.print("1.���� 2.����");
		int select1 = input.nextInt();
		System.out.print("1.�̵� 2.����");
		int select2 = input.nextInt();
		
		
		if(select1==1) pro[i] = new Zeatlot();
		else			pro[i] = new Dragon();
		
		if(select2==1) pro[i].move();
		else			pro[i].attack();
		
		
		}
		
		
	}
}







