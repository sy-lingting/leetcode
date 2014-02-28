package sy.leetcode;

import java.util.ArrayList;

public class GrayCode {

	public ArrayList<Integer> grayCode(int n) {

/*	µÝ¹é´íÔÚÄÄ£¿	
 * if (n == 1) {
			arrayList.add(0);
			arrayList.add(1);
			return arrayList;
		}
		int size = grayCode(n-1).size();
		for(int i=size-1; i>=0; i--) {
			arrayList.add(grayCode(n-1).get(i)+(1<<n-1));
			System.out.println(grayCode(n-1).get(i)+(1<<n-1));
		}
		
		return arrayList;*/
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if (n == 1);
		arrayList.add(0);
		arrayList.add(1);
		for(int i=2; i<=n; i++) {
			System.out.println("j="+ (1<<(i-1)));
			for(int j=(1<<(i-1)); j>0; j--) {
				arrayList.add((1<<(i-1))+arrayList.get(j-1));
			}
		}
		return arrayList;
	}
	public static void main(String[] args) {
		GrayCode gc = new GrayCode();
		System.out.println(gc.grayCode(3));
	}
}
