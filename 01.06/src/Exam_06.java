
// ������ �˾ƺ��� 

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
	public Point3d() { // �����ڴ� ��ȯ���� ������ �ȵȴ� . 
		z=30;
	}
	
	public void disp() {
		System.out.println(x+" "+y+" "+z);
	}
	
	
}





public class Exam_06 {
	
	public static void main(String[] args) {
		
		/*Point2d ap = new Point2d();
		Point2d bp = ap;		// new �� �Ⱦ� ��� bp�� ap�� ���� �ּҸ� ����Ŵ �� ap �� ���� ����Ǹ� bp�� ���� 
		ap.disp();
		ap.x=100;		// ��ü�� �Ӽ��� ���Կ����ڴ� ���� (��, ���� Ŭ���� �̰ų� ��Ӱ���ϰ�쿡)
		bp.disp();
					// Point2d bp =new Point2d(); �ϰ�쿡�� ���� 100���� �ȹٲ� 10 20 �״�� ���� 
		
		Point3d p3 =new Point3d();
		
		// ��ĳ���� 
		Point2d p2 = p3; // p2�� super ���� ������ �ִ� . 
		// ��ĳ���� : �ڽ��� ������ �� �θ��� ��ü�� ����°�  (�ڽ��� ����� �������� ����)
		
		//�ٿ�ĳ���� : �θ��� ��ü�� �ڽ��� ��ü�� ����� �� 
		Point3d down3 = (Point3d)p2; 
		
		System.out.print(down3.z);
		*/
		
		Point2d p2 = new Point3d();
		p2.disp(); // ��ĳ���� �Ǹ� �ڽ� �޼ҵ带 ��� 
		
		
		
		
		
		
		
		
		
		
	}

}
