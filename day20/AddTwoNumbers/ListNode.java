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
import java.util.*;
import java.lang.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode myList1 = new ListNode(2);
        ListNode myList2 = new ListNode(4, myList1);
        ListNode myList3 = new ListNode(3, myList2);

        ListNode myList4 = new ListNode(5);
        ListNode myList5 = new ListNode(6, myList4);
        ListNode myList6 = new ListNode(4, myList5);
        ListNode a = sol.addTwoNumbers(myList6, myList3);
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int digit = 0;
            digit += carry;
            if (l1 != null) {
                digit += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                digit += l2.val;
                l2 = l2.next;
            }
            carry = digit / 10;
            temp.next = new ListNode(digit % 10);
            temp = temp.next;
        }
        return head.next;
    }

    // public ListNode reverseHelper(ListNode revesrList) {

    // }

}


