package sy.leetcode;

public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null) return null;
		ListNode p = head;
		ListNode q = head.next;
		if (q == null) return head;
		head = q;
		while(p != null && q != null) {
			p.next = q.next;
			q.next = p;
		
			if (p.next == null) break;
			if (p.next.next == null) break;
			p = p.next;
			q.next.next = p.next;
			q = p.next;
		}
		return head;
	}
}
