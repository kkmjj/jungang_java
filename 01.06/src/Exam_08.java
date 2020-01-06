

class A08{
	
}

interface B08{}

class C08 extends A08{}


// 클래스는 인터페이스 상속 가능      -> 인터페이스는 클래스를 상속 받을수 없다 
class D08 implements B08{}



class E08 extends A08 implements B08{} // 클래스는 클래스를 상속 받고 인터페이스 상속 받을수 있다 



// 인터페이스는 인터페이스 상속 가능  단순 상속 일때는 extends 
interface F08 extends B08{}



interface G08 extends B08, F08{}  // 인터페이스는 인터페이스를 다중 상속 가능 


// 클래스는 인터페이스 다중 상속 가능 
class H08 implements B08, F08, G08{} 

//클래스는 클래스를 상속받고 인터페이스를 다중 상속 받을수 있다.
class I08 extends A08 implements B08, F08, G08{}




public class Exam_08 {

}
