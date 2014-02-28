package sy.leetcode;

public class SearchInsertPosition {
	public int searchInsert(int[] A, int target) {
		int length = A.length;
		for(int i=0; i< length; i++) {
			if(A[i] >= target) return i;
		}
		return length;
	}
}
