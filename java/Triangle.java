package sy.leetcode;

import java.util.ArrayList;

public class Triangle {
	
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int length = triangle.size();
		for(int i=length-2; i>=0; i--){
			for(int j=0; j<i+1; j++) {			
				if(triangle.get(i+1).get(j) <= triangle.get(i+1).get(j+1)) {	
					triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i+1).get(j)); 
				} else {
					triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i+1).get(j+1));
				}				
			}			
		}

		return triangle.get(0).get(0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
		ArrayList<Integer> i1 = new ArrayList<>();
		i1.add(2);
		triangle.add(i1);
		ArrayList<Integer> i2 = new ArrayList<>();
		i2.add(3);
		i2.add(4);
		triangle.add(i2);
		ArrayList<Integer> i3 = new ArrayList<>();
		i3.add(4);
		i3.add(3);
		i3.add(4);
		triangle.add(i3);
		ArrayList<Integer> i4 = new ArrayList<>();
		i4.add(1);
		i4.add(3);
		i4.add(2);
		i4.add(1);
		triangle.add(i4);
		
		System.out.println(triangle.get(0));
		System.out.println(triangle.get(1));
		//System.out.println(triangle.size());
		//Triangle.minimumTotal(triangle);
		System.out.println(Triangle.minimumTotal(triangle));

	}

}
