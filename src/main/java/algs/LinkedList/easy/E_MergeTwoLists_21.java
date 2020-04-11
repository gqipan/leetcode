package algs.LinkedList.easy;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class E_MergeTwoLists_21 {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 假的节点
        ListNode dummy = new ListNode(0);
        // 游标节点, 专门用来指向dummy 最后的节点
        ListNode cursorNode = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cursorNode.next = l1;
                l1 = l1.next;
            } else {
                cursorNode.next = l2;
                l2 = l2.next;
            }
            // 游标节点往后移动一位
            cursorNode = cursorNode.next;
        }

        if (l1 != null) {
            cursorNode.next = l1;
        }

        if (l2 != null) {
            cursorNode.next = l2;
        }
        return dummy.next;
    }

    public ListNode mergeTwoListsV2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoListsV2(l1.next, l2);
            return l1;
        }else  {
            l2.next = mergeTwoListsV2(l1, l2.next);
            return l2;
        }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        E_MergeTwoLists_21 mergeTwoLists = new E_MergeTwoLists_21();

        System.out.println(mergeTwoLists.mergeTwoListsV2(l1, l2));
    }
}



