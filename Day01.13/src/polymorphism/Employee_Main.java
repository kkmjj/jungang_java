package polymorphism;

public class Employee_Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Manager man = new Manager();
		Engineer eng =new Engineer();
		
		
		emp.taxRate(emp);
		
		emp.taxRate(man);
		
		emp.taxRate(eng);
		
	}

}
