import  java.lang.*;

class Solution {
    // * Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int nodeCounter = 0;
        while (current != null) {
            nodeCounter++;
            current = current.next;
        }
        if (nodeCounter == 1) {
            current = head;
            return current;
        }

        int middle = nodeCounter / 2;
        int copiedCount = middle;
        System.out.println("Copied Count: " + middle);
        
        while (copiedCount != 0) {
            head = head.next;
            copiedCount--;
        }
        System.out.println("Head is point at: "  + head.val);
        ListNode solution = head;
        // while (head != null) {
        //     solution.val = head.val;
        //     solution = solution.next;
        //     head = head.next;
        // }
        return solution;
    }

    public void printList(ListNode node) {
        ListNode current = node;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        //list = new ListNode(2, list);
        //list = new ListNode(3, list);
        //list = new ListNode(4, list);
        //list = new ListNode(5, list);
        // list = new ListNode(6, list);
        Solution sol = new Solution();
        sol.printList(list);
        ListNode solution1 = sol.middleNode(list);
        sol.printList(solution1);
    }
}