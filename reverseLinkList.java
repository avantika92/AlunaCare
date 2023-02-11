public class reverseLinkList {
    public class ListNode{
        int value;
        ListNode next;
        ListNode (){};
        ListNode (int value){this.value =value;}
        ListNode(int value, ListNode next) {this.value =value; this.next=next;}
    }
    //iterative
    public static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }
    }

}
