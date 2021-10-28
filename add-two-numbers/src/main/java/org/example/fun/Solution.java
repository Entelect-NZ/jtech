package org.example.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution {

    public ListNode addTwoNumbers(
            ListNode l1,
            ListNode l2
    ) {
//        List<Integer> values = new ArrayList<>();

        ListNode itrL1 = l1;
        ListNode itrL2 = l2;
        ListNode result = null;

        int firstDigit = 0;
        while (itrL1 != null || itrL2 != null) {

            int current_val = getNodeValue(itrL1) + getNodeValue(itrL2) + firstDigit;
            if (current_val > 9) {
                firstDigit = current_val / 10;
                int lastDigit = current_val % 10;

//                values.add(lastDigit);
                result = new ListNode(lastDigit, result);
            } else {
                firstDigit = 0;

//                values.add(current_val);
                result = new ListNode(current_val, result);
            }

            if (itrL1 != null) {
                itrL1 = itrL1.next;
            }
            if (itrL2 != null) {
                itrL2 = itrL2.next;
            }
        }

        if (firstDigit != 0) {
//            values.add(firstDigit);
            result = new ListNode(firstDigit, result);
        }

//        List<ListNode> nodes = values.stream().map(ListNode::new).collect(Collectors.toList());
//
//        for (int x = 0; x < nodes.size(); x++) {
//            if (x + 1 < nodes.size()) {
//                nodes.get(x).next = nodes.get(x + 1);
//            }
//        }
//        return nodes.get(0);

        return result;
    }

    private int getNodeValue(ListNode itr) {
        return itr != null ? itr.val : 0;
    }


}
