package Basics.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    // Reverse a LinkedList
    public ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }

        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }

    public void appendToTail(ListNode head, int d){
        ListNode endListNode = new ListNode(d);
        ListNode n = head;

        while(n.next != null){
            n = n.next;
        }

        n.next = endListNode;
    }

    public ListNode deleteListNode(ListNode head, int d){
        ListNode n = head;

        if(n.data == d){
            return head.next;
        }

        while(n.next != null){
            if(n.next.data == d) {
                n.next = n.next.next;
                return head;
            }

            n = n.next;
        }

        return head;
    }

    // Delete duplicates from a LinkedList
    public void deleteDups(ListNode n){
        if(n == null){
            return;
        }

        ListNode previous = null;
        Set<Integer> set = new HashSet<>();

        while(n != null){
            if(set.contains(n.data)){
                previous.next = n.next;
            }
            else {
                set.add(n.data);
                previous = n;
            }

            n = n.next;
        }
    }

    // Delete duplicates from a LinkedList without buffer
    public void deleteDupsWithoutBuffer(ListNode n){
        if(n == null){
            return;
        }

        ListNode current = n;
        while(current != null) {
            ListNode runner = current;

            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }
                else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }

    // Return Kth to last node
    public ListNode kthToLastNode(ListNode head, int k){
        if(head == null){
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head;

        for(int i=0; i<k; i++){
            if(p1 == null){
                return null;
            }
            p1 = p1.next;
        }

        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data){
        this.data = data;
    }
}


