import java.util.*;
// ��� 
class A03 extends Object { // �⺻������ exteds Object �̴�  ���� ���� 
	
	public String toString() {			// �������̵� object�� �̹� toString�� ������ �ִµ� �̷��� ���� ���� ����ϴ°� ���� 
		return "��Ӱ�����";
	}
	
}

/*
 class ��� {
 
 
 }
 
 class �л� extends ��� {		// ��� ���� 
 	String �б� ;	
 }
 
 class ���� extends ��� {		//���԰���
 
 	�л� st= new �л�():;
 }
 
 
 
 */

public class Exam_03 {

	public static void main(String[] args) {
			
		A03 a = new A03();
		
		System.out.print(a.getClass());
		System.out.println(a.toString());
		System.out.print(a);

	}

}
