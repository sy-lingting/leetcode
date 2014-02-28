package sy.leetcode;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode p = null;
		ListNode head = null;
		if((l1 != null) && (l2 != null)) {
			if (l1.val <= l2.val) {
				head = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				head = new ListNode(l2.val);
				l2 = l2.next;
			}
		} else if (l1 != null) {
			head = new ListNode(l1.val);
			l1 = l1.next;
		} else if (l2 != null) {
			head = new ListNode(l2.val);
			l2 = l2.next;
		} 
		p = head;
		while((l1 != null) && (l2 != null)) {
				if (l1.val <= l2.val) {
					p.next = new ListNode(l1.val);
					l1 = l1.next;
				}
				else {
					p.next = new ListNode(l2.val);
					l2 = l2.next;
				}
				p = p.next;
		}
		while(l1 != null) {
			p.next = new ListNode(l1.val);
			l1 = l1.next;
			p = p.next;
		}
		while(l2 != null) {
			p.next = new ListNode(l2.val);
			l2 = l2.next;
			p = p.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
