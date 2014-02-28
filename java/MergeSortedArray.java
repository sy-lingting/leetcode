package sy.leetcode;

public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int length = m+n-1;
        m = m-1;
        n = n-1;
 		while((m != -1) && (n != -1)) {
 			if(A[m] >= B[n]) {
 				A[length--] = A[m--];
 			} else {
 				A[length--] = B[n--];
 			}
 		}
 		while(n != -1) {
 			A[n] = B[n];
 			n--;
 		} 
     }
	
	public static void main(String[] args) {
		MergeSortedArray msa = new MergeSortedArray();
		int[] A = new int[8];
		A[0] = 1;
		A[1] = 3;
		A[2] = 5;
		A[3] = 7;
		int[] B = new int[] {2,4,6,8};
		System.out.println("test");
		msa.merge(A, 4, B, 4);
		for(int i=0; i<8; i++) {
			System.out.println(A[i]);
		}
	}
}
