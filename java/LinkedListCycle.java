package sy.leetcode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = p;
        while(p != null && q != null) {   
        	if(p == null || q == null || q.next == null) {
        		return false;
        	} 
        	p = p.next;
        	q = q.next.next;
        	if (p == q) return true;
        }
        return false;
    }
}
