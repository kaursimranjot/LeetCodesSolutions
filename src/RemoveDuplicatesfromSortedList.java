/*Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode res=new ListNode(head.val);
        ListNode temp=res;
        while(head!=null){
            if(temp.val!=head.val){
                ListNode n=res;
                while(n.next!=null)
                    n=n.next;
                n.next=new ListNode(head.val);
                temp=temp.next;
            }
            head=head.next;
        }
        return res;
    }
}