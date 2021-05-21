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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int sum=0;
        int carry=0;
        
        int val2=0;
        int val1=0;
        while(l1!=null||l2!=null)
        {
            if(l1!=null)
                val1=l1.val;
            else
                val1=0;
            
            if(l2!=null)
                val2=l2.val;
            else
                val2=0;
            
            sum=carry+val1+val2;
            carry=sum/10;
            ListNode dig=new ListNode(sum%10);
            curr.next=dig;
            curr=curr.next;
            
            if(l1!=null)
                l1=l1.next;
            
            if(l2!=null)
                l2=l2.next;
           
            
            
        }
        
        if(carry>0)
        {
            ListNode dig=new ListNode(1);
            curr.next=dig;
            curr=curr.next;
        }
       return dummy.next;
    }
}