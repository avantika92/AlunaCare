public class LinkedListImpl<T>{
    public class Node<Int>{
        public int data; //data could be int, string,objects of multiple types
        public Node pointer; //pointer for next node
    }
    public Node headNode;
    public int size;

    //constructor
    public LinkedListImpl(){
        headNode =null;//list is empty since head is null(ie first element)
        size=0;
    }
    /*basic operation
    insertAtEnd(data), insertAtHead(data), delete(data), deleteAtHead(data), deleteAtHead(data), search(data), isEmpty()
     */
}
