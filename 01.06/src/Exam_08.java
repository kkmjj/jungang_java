

class A08{
	
}

interface B08{}

class C08 extends A08{}


// Ŭ������ �������̽� ��� ����      -> �������̽��� Ŭ������ ��� ������ ���� 
class D08 implements B08{}



class E08 extends A08 implements B08{} // Ŭ������ Ŭ������ ��� �ް� �������̽� ��� ������ �ִ� 



// �������̽��� �������̽� ��� ����  �ܼ� ��� �϶��� extends 
interface F08 extends B08{}



interface G08 extends B08, F08{}  // �������̽��� �������̽��� ���� ��� ���� 


// Ŭ������ �������̽� ���� ��� ���� 
class H08 implements B08, F08, G08{} 

//Ŭ������ Ŭ������ ��ӹް� �������̽��� ���� ��� ������ �ִ�.
class I08 extends A08 implements B08, F08, G08{}




public class Exam_08 {

}
