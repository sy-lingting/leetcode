package sy.leetcode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		reverseTree(root.right);
		return isSameTree(root.left, root.right);
	}
	public void reverseTree(TreeNode t) {
		if(t == null) return;
		TreeNode tempNode = null;
		tempNode = t.left;
		t.left = t.right;
		t.right = tempNode;
		reverseTree(t.left);
		reverseTree(t.right);
		return;
	}
	public boolean isSameTree(TreeNode t1, TreeNode t2) {
		boolean bool = true;
		if (t1 != null && t2 != null) {
			if (t1.val != t2.val) {
				bool = false;
				return bool;
			}
		}
		if (t1 != null && t2 == null) {
			bool = false;
			return bool;
		} else if (t2 != null && t1 == null) {
			bool = false;
			return bool;
		} else if(t1 == null && t2 == null) 
			return true;
		bool = isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
		return bool;
	}
}
