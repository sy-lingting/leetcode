package sy.leetcode;

public class SingleNumber {

	public int singleNum(int[] A) {
		/*for(int i=0; i<=A.length-1; i++) {
			if(i == A.length-1) return A[A.length-1];
			for(int j=i+1; j<A.length; j++) {
				if(A[i] == A[j]) {
					System.out.println(i+" and " + j+" equals..");
					if(j == i+1) {
						i++;
						break;
					} else {
						int temp = A[i+1];
						A[i+1] = A[j];
						A[j] = temp;
						i++;
						break;
					}
				} 
					if (j == A.length-1)
						return A[i];
			}
		}
		return 0;*/
		  int n = A.length;
		  if(n == 1) return A[0];
		  while(--n != 0) {
			  A[n-1]^=A[n];
			  System.out.println("A[" + n + "] " +A[n]);
		  }
		  return A[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{2,2,1};
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		SingleNumber singleNumber = new SingleNumber();
		int r = singleNumber.singleNum(A);
		System.out.println(r);
	}

}


