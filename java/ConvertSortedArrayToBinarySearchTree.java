package sy.leetcode;

public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num) {
		TreeNode root = null;
		int low = 0;
		int high = num.length-1;
		root = buildTree(num, low, high);
		return root;
	}
	public TreeNode buildTree(int[] num, int low, int high) {
		if(low>high) return null;
		TreeNode t = null;
		int mid = (low + high) / 2;
		t = new TreeNode(num[mid]);
		t.left = buildTree(num, low, mid-1);
		t.right = buildTree(num, mid+1, high);
		return t;
	}
}
