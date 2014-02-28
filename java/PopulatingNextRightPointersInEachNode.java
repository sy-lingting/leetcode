package sy.leetcode;
class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;
	public TreeLinkNode(int x) {
		val = x;
	}
}
public class PopulatingNextRightPointersInEachNode {
	public void connect(TreeLinkNode root) {
/*	这他妈递归哪里不对啊。。。	
 * if(root == null) return;
		if((root.left != null) && (root.right != null)) {
			root.left.next = root.right;
		} else if ((root.left != null) && (root.right == null)) {
			root.left.next = null;
		}
		if((root.right != null) && (root.next != null) && (root.next.left != null)) {
			root.left.next = root.next.left;
		}
		connect(root.left);
		connect(root.right);
		return;*/
		TreeLinkNode p = root;
		while(p != null) {
			TreeLinkNode q = p;
			while (q != null) {
				if((q.left != null) && (q.right) != null) {
					q.left.next = q.right;
				}
				if((q.right != null) && (q.next != null)) {
					q.right.next = q.next.left;
				}
				q = q.next;
			}
			p = p.left;
		}
		
	}
}
