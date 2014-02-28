package sy.leetcode;

public class BestTimeToSellAndBuyStockII {
	public static int maxProfit(int[] prices) {
        int length = prices.length;
        int sum = 0;
        for(int i=0; i < length; i++) {
        	if(i == length-1) return sum;
        	for (int j = i; j < length; j++) {
        		if((j == length-2) && (prices[j] <= prices[j+1])) {
        			sum+=(prices[j+1] - prices[i]);
        			return sum;
        		}
        		if((j == length-2) && (prices[j] > prices[j+1])) {
        			sum+=(prices[j] - prices[i]);
        			return sum;
        		}
        		else if(prices[j] > prices[j+1]) {
        			sum+=prices[j] - prices[i];
        			i = j;
        			break;
        		}
        	}
        }
		return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {1,2,3,2,1,5,3,2,1};
		int sum = BestTimeToSellAndBuyStockII.maxProfit(A);
		System.out.println(sum);
	}

}
