/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        
    }
}
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int l1Value = 0;
        int l2Value = 0;
        ListNode result = new ListNode();
        ListNode head = result;
        while (l1 != null && l2 != null) {
            if (l1 == null) {
                l2Value = l2.val;
                head.next = new ListNode(l2Value);
                l2 = l2.next;
            } else if (l2 == null) {
                l1Value = l1.val;
                head.next = new ListNode(l1Value);
                l1 = l1.next;
                head = head.next;
            } else {
                l1Value = l1.val;
                l2Value = l2.val;
                if (l1Value > l2Value) {
                    head.next = new ListNode(l1Value);
                    l2 = l2.next;
                    head = head.next;
                } else if (l1Value < l2Value) {
                    
                }
            }  
            
        }
    }
}