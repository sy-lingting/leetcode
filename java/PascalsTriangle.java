package sy.leetcode;

import java.util.ArrayList;

public class PascalsTriangle {
	public static ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<numRows; i++) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			if (i == 0) {
				a.add(1);
				/*if (arrayList.isEmpty()) {
					arrayList.add(a);
				}*/
			} else if (i == 1) {
				a.add(1);
				a.add(1);
			} else {
				for (int j=0; j<=i; j++) {
					if(j == 0) {
						a.add(1);
					} else if(j < i) {
						//System.out.println("let's see b: ");
						ArrayList<Integer> b = arrayList.get(i-1);
						
						a.add( b.get(j-1)+b.get(j)); 
					
					}	else if (j == i)
						a.add(1);

				}
			}
			System.out.println(a);
			arrayList.add(a);
		}
		return arrayList;
	}
	public static void main(String[] args) {
		System.out.println(PascalsTriangle.generate(5));
	}
}
