package singletone;
//Singleton ->  메소드를 통해서 객체생성을 한번만 하고, 계속해서 메소드 호출 

public class Bank {

	
	String name;  
	
	private static Bank b = new Bank("신한은행");		// 클래스 안에서 생성 
	
	
	private  Bank() {
		 
	}
	private  Bank(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static  Bank getBank() {
		
		return b;
	}
	
	
	// ctrl + space 눌러서 toString 선택 
@Override
	public String toString() {
		
		return name;
	}	
	
	
	

}
