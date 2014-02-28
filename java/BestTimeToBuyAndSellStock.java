package sy.leetcode;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		if(prices.length <= 1) return 0;
		for (int i=0; i<prices.length-1; i++) {
			prices[i] = prices[i+1] - prices[i];
		}
		int low = 0;
		int high = prices.length-2;
        int sum = findMaximumSubArray(prices, low, high);
        if (sum < 0) return 0;
		return sum;
	}
	public int findMaxCrossingSubArray(int[] array, int low, int mid, int high) {
		int leftSum = -0x10000000;
		int rightSum = -0x10000000;
		int sum = 0;
		for(int i=mid; i>=low; i--) {
			sum+=array[i];
			if(sum >= leftSum) {
				leftSum = sum;
			}
		}
		sum = 0;
		for(int i=mid+1; i<=high; i++) {
			sum+=array[i];
			if(sum >= rightSum) {
				rightSum = sum;
			} 
		}
		return leftSum+rightSum;
	}
	
	public int findMaximumSubArray(int[] A, int low, int high) {
		if (high == low) return A[low];
		int mid = (high+low)/2;
		int leftSum = findMaximumSubArray(A, low, mid);
		int crossSum = findMaxCrossingSubArray(A, low, mid, high);
		int rightSum = findMaximumSubArray(A, mid+1, high);
		if (leftSum >= crossSum && leftSum >= rightSum)
			return leftSum;
		else if (rightSum >= leftSum && rightSum >= crossSum) 
			return rightSum;
		else return crossSum;
	}
	public static void main(String[] args) {
		int[] A = new int[]{1,2};

		BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
		System.out.println(b.maxProfit(A));
	}
	
}
