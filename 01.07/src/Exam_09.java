

// ��Ƽ������ -> Thread ��� / Runnable �������̽� ��� 

// Thread ��ӽÿ��� -> public void run() �޼ҵ带 �������̵� �Ѵ�. // Thread���� Main ��� 
// start �޼ҵ带 ����Ͽ� ����  //  th.run() -> ���� thread ��� 

//Runnable ���� 
// Thread ��ü�� �־ ��� 




class MyThread extends Thread {
	public void run() {
		System.out.println("MyThread ���� ");
	}
	
}

class MyThreadinterface implements Runnable{
	public void run() {
		System.out.println("interface thread ���� ");
	}
}


public class Exam_09 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		
		MyThreadinterface th_in = new MyThreadinterface();
		Thread t = new Thread(th_in); 
		
		
		System.out.println("main Ŭ���� ����");
		
		th.start();
		t.start();
		
		System.out.println("main Ŭ���� ����");

	}

}
