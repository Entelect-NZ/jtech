package org.example.fun;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddSumTest {

    @Test
    public void testZero() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode expected = new ListNode(0);

        Solution solution = new Solution();

        // when
        ListNode actual = solution.addTwoNumbers(l1, l2);

        // then
        // Output: [0]
        String sExpected = expected.toString();
        String sActual = actual.toString();
        assertEquals(sExpected, sActual);
    }

    @Test
    public void testAddSameSizeEasy() {
        // given
//        Input: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1end = new ListNode(1);
        ListNode l1mid = new ListNode(1, l1end);
        ListNode l1 = new ListNode(1, l1mid);

        ListNode l2end = new ListNode(2);
        ListNode l2mid = new ListNode(2, l2end);
        ListNode l2 = new ListNode(2, l2mid);

        ListNode node8 = new ListNode(3);
        ListNode node0 = new ListNode(3, node8);
        ListNode expected = new ListNode(3, node0);

        Solution solution = new Solution();

        // when
        ListNode actual = solution.addTwoNumbers(l1, l2);

        // then
        // Output: [3,3,3]
        String sExpected = expected.toString();
        String sActual = actual.toString();
        assertEquals(sExpected, sActual);
    }


    @Test
    public void testAddSameSizeHard() {
        // given
//        Input: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1end = new ListNode(3);
        ListNode l1mid = new ListNode(4, l1end);
        ListNode l1 = new ListNode(2, l1mid);

        ListNode l2end = new ListNode(4);
        ListNode l2mid = new ListNode(6, l2end);
        ListNode l2 = new ListNode(5, l2mid);

        Solution solution = new Solution();

        // when
        ListNode actual = solution.addTwoNumbers(l1, l2);

        // then
        // Output: [7,0,8]
        String sExpected = "7,0,8";
        String sActual = actual.toString();
        assertEquals(sExpected, sActual);
    }

    @Test
    public void testAddDifferentSize() {
//        l1 = [9,9,9,9,9,9,9]
        ListNode inputNode1 = createListNode(9, 7);
//        l2 = [9,9,9,9]
        ListNode inputNode2 = createListNode(9, 4);

        Solution solution = new Solution();

        // when
        ListNode actual = solution.addTwoNumbers(inputNode1, inputNode2);

        // then
        // Output: [8,9,9,9,0,0,0,1]
        String sExpected = "8,9,9,9,0,0,0,1";
        String sActual = actual.toString();
        assertEquals(sExpected, sActual);
    }

    @Test
    public void testAddDifferentSize2() {
//        l1 = [9,9,9,9,9,9,9,9]
        ListNode inputNode1 = createListNode(9, 8);
//        l2 = [9,9,9]
        ListNode inputNode2 = createListNode(9, 3);

        Solution solution = new Solution();

        // when
        ListNode actual = solution.addTwoNumbers(inputNode1, inputNode2);

        // then
        // Output: [8,9,9,9,0,0,0,1]
        String sExpected = "8,9,9,0,0,0,0,0,1";
        String sActual = actual.toString();
        assertEquals(sExpected, sActual);
    }

    @Test
    public void testAddDifferentSize3() {
//        l1 = [9,9,9]
        ListNode inputNode1 = createListNode(9, 3);
//        l2 = [0]
        ListNode inputNode2 = createListNode(0, 1);

        Solution solution = new Solution();

        // when
        ListNode actual = solution.addTwoNumbers(inputNode1, inputNode2);

        // then
        // Output: [8,9,9,9,0,0,0,1]
        String sExpected = "9,9,9";
        String sActual = actual.toString();
        assertEquals(sExpected, sActual);
    }

    @Disabled
    @Test
    public void testLargeLoadOnListNodeSolution() {
        ListNode inputNode1 = createListNode(9, 1000000);
        ListNode inputNode2 = createListNode(9, 1000000);

        Solution solution = new Solution();

        // when
        ListNode actual = solution.addTwoNumbers(inputNode1, inputNode2);

        String sExpected = "9,9,9";
        String sActual = actual.toString();
        assertEquals(sExpected, sActual);
    }

    private ListNode createListNode(
            int data,
            int times
    ) {
        ListNode actualNode = new ListNode(data);
        for (int i = 0; i < times - 1; i++) {
            ListNode node = new ListNode(data, actualNode);
            actualNode = node;
        }

        return actualNode;
    }


}
