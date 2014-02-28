package sy.leetcode;

import java.util.ArrayList;

import sy.leetcode.datastruct.TreeNode;
/*public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}*/

public class BinaryTreePreorderTraversal {

	public ArrayList<Integer> preorderTraversal(TreeNode root){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		treeTraversal(root, arrayList);
		return arrayList;
		
	}
	public void treeTraversal(TreeNode node, ArrayList<Integer> arrayList) {
		if(node == null) {
			return ;
		}
		arrayList.add(node.val);
		treeTraversal(node.left, arrayList);
		treeTraversal(node.right, arrayList);
		return ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
