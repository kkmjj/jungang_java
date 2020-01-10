package inherit;

public class ExtendsTest {

	public static void main(String[] args) {
					Child c =new Child();
					
					System.out.println(c.paraentVar);
					System.out.println(c.childVar);
					
					c.childMethod();
					c.parentMethod();
					
					Parent p =new Parent();
					
					p.parentMethod();
					
					
					Parent pa;				// 하나의 부모로 여러 자식 객체를 가리키는것 
					pa= new Child(); // 다형성 
					 pa = new Child2(); // 다형성 
					
					//부모의 눈으로 자식을 봄 
					System.out.println(pa.paraentVar);  // 자동 형변환 
					//System.out.println(((Parent)pa).childVar); // -> 오류 
					
					((Child) pa).childMethod();  // 강제 형변환
					pa.parentMethod();
					
					int a=10;
					float b=20;
					b=a;	// 자동형변환
				    a=(int)b; //강제
					
				    
				    Parent pa2 = new Parent();
				    Child ch = (Child)pa2;
					System.out.println(ch.paraentVar);  // 자동 형변환 
					System.out.println((ch.childVar)); 
					
					((Child)ch).childMethod();  // 강제 형변환
					ch.parentMethod();
			

	}

}
