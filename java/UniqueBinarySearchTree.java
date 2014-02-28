package sy.leetcode;

public class UniqueBinarySearchTree {
	public int numTrees(int n) {
		if(n <= 1) return 1;
		//if(n == 2) return 2;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum+= numTrees(i)*numTrees(n-i-1);
		}
		return sum;
	}
	public static void main(String[] args) {
		UniqueBinarySearchTree ubst = new UniqueBinarySearchTree();
		System.out.println(ubst.numTrees(3));
	}
}
