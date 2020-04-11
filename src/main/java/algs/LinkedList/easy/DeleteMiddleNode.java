package algs.LinkedList.easy;

/**
 * @author JiaYue
 * @since 2020/4/10 12:59
 */
public class DeleteMiddleNode {

    public static void deleteNode(ListNode node) {

        // 快慢指针先找到中间节点
        ListNode lowNode = node;
        ListNode fastNode = node;
        while (lowNode != null && fastNode != null) {
            lowNode = lowNode.next;
            fastNode = fastNode.next.next;
        }

        ListNode middleNode = lowNode;

        // 现在考虑怎么删除中间节点了

        // 找到中间节点的前一个节点
        ListNode preMiddleNode = node;
        while (middleNode != null && (preMiddleNode.next.val != middleNode.val)) {
            preMiddleNode = preMiddleNode.next;
        }

        preMiddleNode.next = middleNode.next;
    }


    // 4 5 1 9
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode needDeleteNode = new ListNode(5);
        listNode.next = needDeleteNode;
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(9);

        deleteNode(listNode);
    }

}
