package sub3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		
		//  집합(Set) 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(3);
		set.add(3);
		
		System.out.println(set);
		
		// 집합에(Set) 대한 반복자
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) { 					// 반복자로 데이터가 없을 때 까지 반복 수행
			
			System.out.print(it.next());		// 데이터를 출력하고 다음 데이터 탐색
		}
		
		// 반복문 처리
		
		for(int num : set) {
			System.out.print(num + ",");
		}
		
		System.out.print("\n");
		
		//------------------------------------
		// 집합 연산
		//------------------------------------
		
		Set<String> SetA = new HashSet<>(Arrays.asList("서울", "대전", "대구", "부산", "광주"));
		Set<String> SetB = new HashSet<>(Arrays.asList("인천", "부산", "울산", "수원", "서울"));
			
		
		// 합집합
		Set<String> union = new HashSet <String>(SetA);
		union.addAll(SetB);
		
		System.out.println("합집합 : " + union);
		
		
		
		
		// 교집합
		Set<String> intersection  = new HashSet <String>(SetA);
		intersection.retainAll(SetB);
		
		System.out.println("교집합 : " + intersection);
		
		// 차집합
		Set<String> minus  = new HashSet <String>(SetA);
		minus.removeAll(SetB);
		
		System.out.println("차집합 : " + minus);
		
		//-----------------------------------
		// TreeSet 실습 
		//-----------------------------------
		
		Set<Integer> scores = new TreeSet<>();
		
		scores.add(68);
		scores.add(56);
		scores.add(89);
		scores.add(92);
		scores.add(70);
		scores.add(70);
		
		System.out.println(scores);
	
	}

}
