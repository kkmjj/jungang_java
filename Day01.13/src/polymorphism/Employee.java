package polymorphism;

public class Employee {
	int abc;

	// 파라미터의 다형성 
	public void taxRate(Employee e) { // 부모의 눈으로 자식을 보기 위해서 파라미터에 부모를 넣어둔다 
		// 부모 클래스 로 안하면 매개변수에 원하는 자식객체를 넣어서 많은 메소드를 만들어야 한다. 
		
		if(e instanceof Manager) // 다형성에서 형변한 여뷰 // 즉 e 가 Manager인가 
		{
			Manager m = (Manager)e;
			System.out.println("Manager 세금 구하기 ");
		}
		else if( e instanceof Engineer)
		{
			Engineer m = (Engineer)e;
			System.out.println("Enginner 세금 구하기 ");
		}
	   
		else if( e instanceof Employee)
		{
			System.out.println("employee 세금 구하기 ");
		}
		
	
	}
	
}
