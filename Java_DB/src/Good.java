
public class Good {
	
	public Good() { // ctrl + space 			순위 3
		System.out.println("생성자");
	}
	
	// 인스턴스 초기화 블럭  -> 객체 생성시 동작  순위 2
	{
		System.out.println("인스턴스 초기화블럭");
	}
	
	// staic 초기화 블럭  -> 프로그램 실행시 동작  순위 1 
	static
	{
		System.out.println("static 블럭");
	}
	
}
