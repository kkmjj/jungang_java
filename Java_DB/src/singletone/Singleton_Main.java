package singletone;

public class Singleton_Main {

	public static void main(String[] args) {
		// Bank bank = new Bank();  // 컴파일오류 
		
		Bank b1 = Bank.getBank();
		
		System.out.print(b1.name);
		
		
		Bank b2 = Bank.getBank();
		
		if(b1==b2)System.out.print(b2); // toString 오버라이딩 해서 사용해보기  // 재정의
		// 재정의란 자바안에 있는 것을 사용하는것이 아니라 내가 사용한 것으로 사용하겠다 .
		
		
		
		
		
		

	}

}
