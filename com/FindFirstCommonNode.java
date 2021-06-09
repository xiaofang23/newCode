package com;

import com.model.ListNode;

public class FindFirstCommonNode {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        ListNode c = new ListNode(3);
        b.next = c;
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        d.next = e;
        ListNode f = new ListNode(6);
        c.next = f;
        e.next = f;
        ListNode g = new ListNode(7);
        f.next=g;
        System.out.println(FindFirstCommonNode(a, d).val);

    }
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        
        if(pHead1 == null || pHead2 == null){
            return null;
        }

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;

        while(p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;

            if(p1 != p2) {
                if(p1==null) p1 = pHead2;
                if(p2==null) p2 = pHead1;
            }
        }
        return p1;
    }
}
