package sy.leetcode;
// Definition for binary tree
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class MaximumDepthOfBinaryTree {
    	int length = 0;
	    public int maxDepth(TreeNode root) {
	    	int sum = 0;
	    	f(root, sum);
	    	return length;
	    }
	    public void f(TreeNode t,int sum) {
	    	if(t == null){
	    		if(sum > length) {
	    			length = sum;
	    		}
	    		return;
	    	}
	    	sum++;
	    	f(t.left,sum);
	    	f(t.right,sum);
	    }
	    
}