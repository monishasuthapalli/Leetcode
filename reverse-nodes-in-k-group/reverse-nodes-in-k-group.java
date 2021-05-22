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
    
    static ListNode th=null;
    static ListNode tt=null;
    public ListNode reverseKGroup(ListNode head, int k) {
        
        
        if(head==null||head.next==null||k<=0)
        {
            return head;   
        }
        
        ListNode oh=null;
        ListNode ot=null;
        
        ListNode curr=head;
        int size=size(head);
        while(size>=k)
        {
            int tempK=k;
            
            while(tempK-->0)
            {
                ListNode fw=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=fw;
                
            }
            if(oh==null)
            {
                oh=th;
                ot=tt;
            }
            else
            {
                ot.next=th;
                ot=tt;
            }
            th=null;
            tt=null;
            size=size-k;
            
        }
        ot.next=curr;
        return oh;
      
        
    }
    
    
    
    
    static void addFirst(ListNode node)
    {
        if(th==null)
        {
            th=node;
            tt=node;
            
        }
        
        else
        {
            node.next=th;
            th=node;
            
            
        }
        
    }
    
    static int size(ListNode head)
    {
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        return len;
    }
    
}