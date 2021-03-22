package lets.code;

import java.util.PriorityQueue;

public class _23_MergeKSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((e1, e2) -> e1.val - e2.val);
        for(ListNode node: lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        
        ListNode head = null, last = null;
        ListNode min = null;
        
        while (pq.peek() != null) {
            min = pq.poll();
            
            if(head == null) {
                head = last = min;
            } else {
                last.next = min;
                last = min;
            }
            
            if(min.next != null) {
                pq.add(min.next);
            }
        }
        return head;
    }
	
	public static void main(String[] args) {
		
		_23_MergeKSortedLists t = new _23_MergeKSortedLists();
		
		ListNode[] list1 = new ListNode[3];
		list1[0] = new ListNode(1);
		list1[0].next = new ListNode(4);
		list1[0].next.next = new ListNode(5);
		list1[1] = new ListNode(1);
		list1[1].next = new ListNode(3);
		list1[1].next.next = new ListNode(4);
		list1[2] = new ListNode(2);
		list1[2].next = new ListNode(6);
		print(t.mergeKLists(list1));
		
		ListNode[] list2 = new ListNode[0];
		print(t.mergeKLists(list2));
		
		ListNode[] list3 = new ListNode[1];
		list3[0] = null;
		print(t.mergeKLists(list3));
		
	}
	
	private static void print(ListNode node) {
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
	
	private static class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
