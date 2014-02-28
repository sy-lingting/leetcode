package sy.leetcode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] A) {
        int length = A.length;
    	for (int i=length-1; i>0; i--) {
    		if(A[i] == A[i-1]) {
    			for(int j=i; j<length; j++) {
    				A[j-1] = A[j];
    			}
    			length--;
    			//i++;
    		}
    	}
    	return length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
		int[] A = new int[] {-5,-5,-4,-4,-3,-3,-2,-2,-1,-1,0,0,1,1,2,2};
		int length = r.removeDuplicates(A);
		System.out.println(length);
		for(int i=0; i<length; i++) {
			System.out.print(A[i]);
		}
	}

}
