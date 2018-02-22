package Basics.LinkedList;

import java.util.Stack;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        Stack<Integer> stack = new Stack<>();

        while(fast != null && fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            int top = stack.pop();

            if(top != slow.data){
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}
