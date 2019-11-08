package com.nix;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode result = head;
        while(result.next!=null)
        {
            if(result.val==result.next.val)
                result.next = result.next.next;
            else result = result.next;
            if(result == null) break;
        }
        return head;
    }
}
