/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

        Example:

        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.*/
public class AddTwoNumbers {
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode prev = null;


        while (l1 != null || l2 != null || carry != 0)
        {
            int total = 0;

            if (l1 != null)
            {
                total = total + l1.val;
                l1 = l1.next;
            }
            if (l2 != null)
            {
                total = total + l2.val;
                l2 = l2.next;
            }
            total = total + carry;
            ListNode n = new ListNode(total % 10);
            carry = total / 10;

            if (prev != null)
            {
                prev.next = n;
            }
            else head = n;
            prev = n;
        }
        return head;
    }
}
