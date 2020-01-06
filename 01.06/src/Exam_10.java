

// set은 담는 의미만 가지고 사용                      Map은 각각 key value 형식 으로 사용                    List  순서 있고 재사용 가능 
// collection -> set , Map , List  -> 무한한 데이터의 집합   -> 모두 interface에 속해 있음  그래서 자체를 생성 못함 상속 받아서 사용해야함 

// set -> Hashset , TreeSet 정도 공부하면됨 



// Hashset 


import java.util.*; // 이 안에 HashSet 있음 


public class Exam_10 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();		// HashSet set =new HashSet(원하는 크기 미리 크게 설정 가능 , 다차면 자동으로 몇퍼센트 되면 다시 증가 하는 퍼센트 값도 지정가능);
		
		set.add("홍길동"); // 데이터 넣기 
		System.out.println(set);
		System.out.println(set.size());
		
		set.clear();  // set.remove("홍길동") 원하는 값 지우기  해당값이 있으면 지워지고 없으면 false 반환 
		System.out.println(set);
		set.add("홍길도");
		set.add("rla");
		set.remove("홍길도");
		System.out.println(set);
		
		if(set.contains("rla")) System.out.println(set);		// 존재 여부 판단 
		else System.out.println("존재하지 않습니다");
		
		
		set.add("홍길도");
		set.add("강호동");
		
		
		Object[] data = new Object[set.size()];
		
		set.toArray(data); // set에 있는 모든 값을 data에 넣어라 
		
		
		
		Iterator it = set.iterator();		// 데이터를 꺼낼때 사용 하는 방식 
		while(it.hasNext())
		{
			Object obj = it.next(); 		// 업캐스팅 타입을 모르니 Object로 받아놓음 
			String data = (String)obj;		// string으로 알고 있으니 다운 캐스팅 
			System.out.println(data);
		}

	}

}
