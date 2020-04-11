package algs.LinkedList.middle;

import algs.LinkedList.easy.ListNode;

/**
 * 设计链表-单链表形式
 *
 * @author JiaYue
 * @since 2020/4/10 20:16
 */
public class MyLinkedList_Single_707 {

    private int val;

    int size;
    // sentinel node as pseudo-head
    ListNode dummyHeadNode;


    public MyLinkedList_Single_707() {
        this.size = 0;
        dummyHeadNode = new ListNode(0);
    }


    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cursor = dummyHeadNode;
        // index + 1 是因为 dummyHeadNode 并不是一个实际的链表头结点，只是伪头结点
        for (int i = 0; i < index + 1; i++) {
            cursor = cursor.next;
        }

        return cursor.val;
    }


    public void addAtHead(int val) {
        this.addAtIndex(0, val);
    }


    public void addAtTail(int val) {
        this.addAtIndex(size, val);
    }


    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }

        if (index < 0) {
            index = 0;
        }


        // find predecessor of the node to be added
        ListNode predNode = dummyHeadNode;
        for (int i = 0; i < index; i++) {
            predNode = predNode.next;
        }

        ListNode insertNode = new ListNode(val);

        insertNode.next = predNode.next;
        predNode.next = insertNode;

        size++;
    }


    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }

        if (index >= size) {
            return;
        }

        ListNode preDeleteNode = dummyHeadNode;
        for (int i = 0; i < index; i++) {
            preDeleteNode = preDeleteNode.next;
        }

        preDeleteNode.next = preDeleteNode.next.next;
        size--;
    }


    //["MyLinkedList",
// "addAtHead",
// "addAtHead",
// "addAtHead",
// "addAtIndex",
// "deleteAtIndex",
// "addAtHead",
// "addAtTail",
// "get",
// "addAtHead",
// "addAtIndex",
// "addAtHead"]
//[[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]

    public static void main(String[] args) {
        MyLinkedList_Single_707 myLinkedList = new MyLinkedList_Single_707();

        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3, 0);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        myLinkedList.get(4);
        myLinkedList.addAtHead(4);
        myLinkedList.addAtIndex(5, 0);
        myLinkedList.addAtHead(6);
    }
}





