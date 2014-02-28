package sy.leetcode;

public class SingleNumII {
	public static int singleNumber(int[] A) {
		for (int i=0; i<A.length; i++) {
			int count = 0;
			for (int j=i+1; j<A.length; j++) {
				if (A[i] == A[j]) {
					System.out.println("i= " + i);
					System.out.println("j= " + j);
					System.out.print("before: ");
					for(int k=0; k<A.length; k++) {
						System.out.print(A[k]);
					}
					System.out.println();
					int temp = A[i+1];
					A[i+1] = A[j];
					A[j] = temp;
					System.out.print("after : ");
					for(int k=0; k<A.length; k++) {
						System.out.print(A[k]);
					}
					System.out.println();
					count++;
					i++;
					if (count == 2) {					
						i++;
						break;
					}
				}
			}
			return A[i];
		}
		return A[A.length-1];
	}
	public static void main(String[] args) {
		int[] A = new int[] {0,0,0,5};
		System.out.println(SingleNumII.singleNumber(A));
	}
}
