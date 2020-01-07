

// 멀티쓰레드 -> Thread 상속 / Runnable 인터페이스 상속 

// Thread 상속시에는 -> public void run() 메소드를 오버라이드 한다. // Thread에서 Main 대용 
// start 메소드를 사용하여 실행  //  th.run() -> 단일 thread 사용 

//Runnable 사용시 
// Thread 객체에 넣어서 사용 




class MyThread extends Thread {
	public void run() {
		System.out.println("MyThread 실행 ");
	}
	
}

class MyThreadinterface implements Runnable{
	public void run() {
		System.out.println("interface thread 실행 ");
	}
}


public class Exam_09 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		
		MyThreadinterface th_in = new MyThreadinterface();
		Thread t = new Thread(th_in); 
		
		
		System.out.println("main 클래스 실행");
		
		th.start();
		t.start();
		
		System.out.println("main 클래스 종료");

	}

}
