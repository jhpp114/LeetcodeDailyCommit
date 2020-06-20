import  java.lang.*;
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
 
class Solution {

    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        int digits = 0;
        int hex = 0;
        while (current != null) {
            current = current.next;
            digits++;
        }
        digits -= 1;
        current = head;
        while (current != null) {
            int temp = current.val;
            hex += temp * Math.pow(2, digits);
            current = current.next;
            temp = 0;
            digits--;
        }

        return hex;
    }

    public static void main(String[] args) {
        
    }
}