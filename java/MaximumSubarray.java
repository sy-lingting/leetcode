package sy.leetcode;

public class MaximumSubarray {

	public int maxSubArray(int[] A) {
		int length = A.length;
		int low = 0;
		int high = (length -1);
		return findMaximumSubarray(A, low, high);
	}
	public int findMaxCrossingSubarray(int[] A, int low, int mid, int high) {
		//System.out.println("In find crossSubarray");
		//System.out.println("low="+low+"  high=" + high +" mid=" +mid);
		int leftSum = -0x80000000;
		int rightSum = -0x80000000;
		int sum = 0;
		for (int i=mid; i>=low; i--) {
			sum+=A[i];
			if(leftSum < sum) {
				leftSum = sum;
			}
		}
		sum = 0;
		for (int j=mid+1; j<=high; j++) {
			sum+=A[j];
			if(rightSum < sum) {
				rightSum = sum;
			}
		}
		//System.out.println(leftSum);
		//System.out.println(rightSum);
		return leftSum + rightSum;
	}
	public int findMaximumSubarray(int[] A, int low, int high) {
		int mid,leftSum,rightSum,crossSum;
		if (low == high)
			return A[low];
		else {
			mid = (low + high)/2;
			System.out.println("mid="+mid);
			leftSum = findMaximumSubarray(A, low, mid);
			crossSum = findMaxCrossingSubarray(A, low, mid, high);
			rightSum = findMaximumSubarray(A, mid+1, high);
		}
		if ((leftSum>=rightSum) && (leftSum>=crossSum)) {
			return leftSum;
		} else if ((rightSum>=leftSum) && (rightSum>=crossSum)) {
			return rightSum;
		} else {
			return crossSum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubarray ms = new MaximumSubarray();
		int[] A = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(A);
		System.out.println(ms.maxSubArray(A));
	}

}
