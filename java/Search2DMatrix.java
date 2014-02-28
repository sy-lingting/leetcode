package sy.leetcode;

public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
	/*	两次折半查找的第一次，怎么搞。。。
	 * int low = 0;
		int high = matrix.length -1;
		int pos = 0;
		while(low <= high) {
			int mid = (low+high)/2;
			if (target == matrix[mid][0]) {
				pos = mid;
				return true;
			} else if (target < matrix[mid][0]) {
				high = mid -1;
			} else {
				low = mid+1;
			}
		}
		pos = low-1;
*/		//这里的第一次查找采用复杂度为O(n)的顺序查找
		int pos = 0;
		for (int i=0; i<matrix.length-1; i++) {
			if(target == matrix[i][0]) return true;
			else if(target > matrix[i][0] && target < matrix[i+1][0]) {
				pos = i;
				break;
			}
			if(i == matrix.length-2) 
				pos = matrix.length-1;
		}
		System.out.println(pos);
		System.out.println(matrix.length -1);
		if(pos > matrix.length-1) return false;
		int low = 0;
		int high = matrix[0].length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if (target == matrix[pos][mid]) {
				pos = mid;
				return true;
			} else if (target < matrix[pos][mid]) {
				high = mid -1;
			} else {
				low = mid+1;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Search2DMatrix s = new Search2DMatrix();
		int[][] matrix = new int[][] {  {1,   3,  5,  7},
										{10, 11, 16, 20},
										{23, 30, 34, 50} 	
										};
		System.out.println(s.searchMatrix(matrix, 0));
	}

}
