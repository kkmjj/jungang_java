package study;


class SungJuk {
	int name;
	int kor;
	int eng;
	protected int total;
	public SungJuk() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SungJuk(String name, int kor ,int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		
	}
	
	
}


class SungJuk2 extends SungJuk {
	
	private int com;
	public SungJuk2 (String name, int kor, int eng, int com)
	{
		super(name,kor,eng);
		this.com=com;
		setTotal():
	}
	
	public void setTotal() {
		total = getKor() +getEng() +com;
		
	}
	
	public void setCom(int com) {this.com = com; }
	public int getCom() {return com; }
	
	
}

public class Exam_05 {


	
	
	
	

	
	public static void main(String[] args) {
	

	}

}
