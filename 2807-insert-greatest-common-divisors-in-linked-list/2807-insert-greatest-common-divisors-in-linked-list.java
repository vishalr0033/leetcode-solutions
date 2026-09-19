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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        if(head == null || head.next == null){
            return head;
        }
        while(temp != null && temp.next != null){
            int gc = gcd(temp.val,temp.next.val);
            ListNode li = new ListNode(gc);
            li.next = temp.next;
            temp.next = li;
            temp = li.next;
        }
        return head;
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}