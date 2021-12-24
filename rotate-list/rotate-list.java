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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        
        ListNode temp = head;
        int count=0;
        
        
        while(temp.next != null){
            count++;
            temp=temp.next;
        }
        
        temp.next=head;
        k = (k % (count+1));
        
        temp=head;
        for(int i=0; i<count-k; i++){
            temp = temp.next;
        }
        
        ListNode t = temp.next;
        temp.next=null;
        head=t;
        
        return head;
        
    }
}