package singletone;

public class Singleton_Main {

	public static void main(String[] args) {
		// Bank bank = new Bank();  // 컴파일오류 
		
		Bank b1 = Bank.getBank();
		
		System.out.print(b1.name);
		
		

	}

}
