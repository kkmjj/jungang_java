
// 다형성 알아보기 

class Point2d{
		int x;
		int y;
	
	public Point2d() {
		x=10;
		y=20;
	}
	
	public void disp() {
		System.out.println(x+" "+y);
	}
}


class Point3d extends Point2d{
	int z;
	public Point3d() { // 생성자는 반환형이 있으면 안된다 . 
		z=30;
	}
	
	public void disp() {
		System.out.println(x+" "+y+" "+z);
	}
	
	
}





public class Exam_06 {
	
	public static void main(String[] args) {
		
		/*Point2d ap = new Point2d();
		Point2d bp = ap;		// new 를 안쓸 경우 bp는 ap와 같은 주소를 가르킴 즉 ap 의 값이 변경되면 bp도 변경 
		ap.disp();
		ap.x=100;		// 객체의 속서은 대입연산자는 가능 (단, 같은 클래스 이거나 상속경우일경우에)
		bp.disp();
					// Point2d bp =new Point2d(); 일경우에는 값이 100으로 안바뀜 10 20 그대로 유지 
		
		Point3d p3 =new Point3d();
		
		// 업캐스팅 
		Point2d p2 = p3; // p2는 super 값만 가질수 있다 . 
		// 업캐스팅 : 자식의 생성자 로 부모의 객체를 만드는것  (자식의 멤버는 접근하지 못함)
		
		//다운캐스팅 : 부모의 객체를 자식의 객체로 만드는 것 
		Point3d down3 = (Point3d)p2; 
		
		System.out.print(down3.z);
		*/
		
		Point2d p2 = new Point3d();
		p2.disp(); // 업캐스팅 되면 자식 메소드를 사용 
		
		
		
		
		
		
		
		
		
		
	}

}
