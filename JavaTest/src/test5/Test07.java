package test5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

	public class Test07 {
		public static void main(String[] args) {
			
			for(int count=1; count <=5; count++) {
				System.out.println(makeLotto());
			}
		}
		
		______________________ makeLotto() {
			_______________ lottoSet = new HashSet<>();
			for(;;) {
				int num = (int) Math.ceil(____________ );
				lottoSet.add(num);
				if( ________ ) {
					break;
				}
			}
			
			// 정렬을 위해 TreeSet 사용
			Set<Integer> treeSet = new TreeSet<>(lottoSet);
			return treeSet;
		}
}