package Basics.LinkedList;

public class LoopDetection {
    public ListNode detectLoop(ListNode head){
        if(head == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return null;
        }

        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
