package algs.LinkedList.easy;

/**
 * @author JiaYue
 * @since 2020/4/10 12:09
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.val).append(" ");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
