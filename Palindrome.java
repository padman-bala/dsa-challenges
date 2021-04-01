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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> reverseStack = new Stack<>();
        ListNode scan = head, check = head;
        
        if (head == null) return false;
        
        while (scan != null) {
            reverseStack.add(scan.val);
            scan = scan.next;
        }
        
        while(check != null) {
            if (check.val != reverseStack.pop()) return false;
            check = check.next;
        }
        
        return true;
    }
}
