package org.example.fun;

import java.util.Objects;

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(
            int val,
            ListNode next
    ) {
        this.val = val;
        this.next = next;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ListNode listNode = (ListNode) o;
//        return val == listNode.val &&
//                Objects.equals(next, listNode.next);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(val, next);
//    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        ListNode node = this;

        do {
            sb.append(node.val);
            sb.append(",");
            node = node.next;
        } while (node != null);

        String result = sb.toString();
        return result.substring(0, result.length() - 1);
    }
}
