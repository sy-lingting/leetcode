package sy.leetcode;

public class SameTree {
	boolean bool = true;
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p != null && q != null) {
			if(p.val != q.val) {
				bool = false;
				return bool;
			}		
		}
		if(p != null && q == null) {
			bool = false;
			return bool;
		}
		if(q != null && p == null) {
			bool = false;
			return bool;
		}
		if(p == null && q == null) return true;
		isSameTree(p.left, q.left);
		isSameTree(p.right, q.right);
		
		return bool;
    }
}
