/*Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
*/

import java.util.ArrayList;

public class LinkedListMiddle {
    public class ListNode{
        int value;
        ListNode next;
        ListNode (){};
        ListNode (int value){this.value =value;}
        ListNode(int value, ListNode next) {this.value =value; this.next=next;}
    }
    public static ListNode middleNode(ListNode head){
        ArrayList<ListNode> arr = new ArrayList<>();
        int len =0;
        while(head !=null){
            arr.add(head);
            head = head.next;
            len++;
        }
        return arr.get(len/2);

    }
    public static void main(String [] args){}


}
