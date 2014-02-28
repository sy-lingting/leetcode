package sy.leetcode;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        /*此处采用递归，但是会 报出Time Limit Exceeded
         * if(n == 1) return 1;
        if(n == 2) return 2;
        return climbStairs(n-1)+climbStairs(n-2);*/
    	//看下面人家的方法多屌
    	if(n <= 2) return n;
    	int stairs[] = new int[n];
    	stairs[1] = 2;
    	stairs[0] = 1;
    	for(int i=2; i<n; i++) {
    		stairs[i] = stairs[i-1] + stairs[i-2];
    	}
    	return stairs[n-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(44));
	}

}
