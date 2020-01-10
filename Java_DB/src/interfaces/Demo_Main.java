package interfaces;

public class Demo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Demoimpl d1  = new Demoimpl();
		
		d1.print();
		d1.write();
		d1.print2();//default 메소드
		Demo.print3(); // static 메소드 
		
		
		
		Demo d;
		d= new Demoimpl();
		// 부모의 눈으로 자식 인터페이스 보기 
		
		((Demoimpl)d).write(); // 해당 자식으로 변경후 사용 
		
		d.print2();
		
		
		// 인터페이스는 객체 생성 불가능 -밑에 는 객체 생성이 아니라 안에 구현만 하는 것 
		//익명구현객체 중요 !!!!!!!!!!
		//-> 클래스 를 따로 만들지 않아도 인터페이스를 직접 들고와서 메소드 구현 가능 (메모리 용량 확보 높아짐)
		Demo d2 = new Demo() {
			
			@Override
			public void print() {
				System.out.println("익명 으로 print 구현 해보기 ");
				
			}
			@Override
			public void print2() {
				System.out.println("익명 으로 default 메소드  print 구현 해보기 ");
				
			}
		};
		
		d2.print();
		d2.print2();
		
		
		
		
		
		

	}

}
