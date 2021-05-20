/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null||headB==null)
            return null;
        
        
        int len1=0;
        ListNode temp=headA;
        while(temp!=null)
        {
            temp=temp.next;
            len1++;
        }
        
        temp=headB;
        int len2=0;
        while(temp!=null)
        {
            temp=temp.next;
            len2++;
        }
        
        int gap=Math.abs(len1-len2);
        
        if(len1>len2)
        {
            for(int i=0;i<gap;i++)
            {
                headA=headA.next;
            }
        }
        
        else
        {
             for(int i=0;i<gap;i++)
            {
                headB=headB.next;
            }
        }
        
        
        while(headA!=headB&&(headA!=null&&headB!=null))
        {
        headA=headA.next;
        headB=headB.next;
        }
        
        if(headA==headB)
        return headA;
        else
            return null;
        
        
    }
}