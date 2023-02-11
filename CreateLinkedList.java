package LinkedAndArrayList;

import org.w3c.dom.Node;

public class CreateLinkedList {
    public void LinkedListImpl(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
    }
}
