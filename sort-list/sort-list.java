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
    public ListNode sortList(ListNode head) {
        
        if(head==null||head.next == null)
        {
            return head;
        }
        ListNode mid=getMid(head);
        ListNode fsh=sortList(head);
        ListNode sh=sortList(mid);
        ListNode merged=mergeTwoLists(fsh,sh);
        
        
        return merged;
    }
    
     ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    
    
    static ListNode mergeTwoLists(ListNode one,ListNode two)
    {
        ListNode three=new ListNode();
        if(one==null)
        return two;
        if(two==null)
        return one;
        if(one.val<two.val)
        {
            three=one;
            one=one.next;
        }
        else
        {
            three=two;
            two=two.next;
        }
        ListNode curr=three;
        
        while(one!=null&&two!=null)
        {
            if(one.val<two.val)
            {
                curr.next=one;
                one=one.next;
            }
            else
            {
                curr.next=two;
                two=two.next;
            }
            curr=curr.next;
        }
        
        if(one==null)
        {
            curr.next=two;
        }
        else
        {
            curr.next=one;
        }
        return three;
        
    }
    
    
}