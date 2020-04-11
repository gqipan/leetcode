package algs.LinkedList.easy;

/**
 * @author JiaYue
 * @since 2020/4/10 13:42
 */
public class DeleteNode_面试0203 {

    // 形参只是地址的copy
    public static void errorDeleteNode(ListNode node) {
        node.val = node.next.val;
        node = node.next;
        System.out.println(node); // 输出  1,9
    }

     // 4,5,1,9
    public static void deleteNode(ListNode node) {
        // 要删除当前节点，那么需要之前前一个节点，但是无法获取前一个节点
        // 所以要把后一个节点的值复制给当前一个节点，然后再干掉下一个节点
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode needDeleteNode = new ListNode(5);
        listNode.next = needDeleteNode;
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(9);

//        deleteNode(needDeleteNode);
        errorDeleteNode(needDeleteNode);
    }
}
