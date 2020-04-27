

public class LinkedList {
    Node head;

    class Node{

        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next = null;

        }
    }
    public void push(int new_data){

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void insertAfter(Node prev_node, int new_data){
       if(prev_node == null){
           System.out.println("Previous node can't be null");
           return;
       }
       Node new_node = new Node(new_data);
       new_node.next = prev_node.next;
       prev_node.next = new_node;
    }
    public void append(int new_data){
        Node new_node = new Node(new_data);

        if(head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next =null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void deleteFront(){
        if(head == null)
        {
            System.out.println("No node to delete");
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;
    }
    public void deleteAfter(int key )
    {
        Node temp = head, prev = null;

        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key ){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return ;

        prev.next = temp.next;
        temp = null;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(6);
        list.push(7);
        list.push(1);
        list.append(4);
        list.insertAfter(list.head,8);
        System.out.println("print");
        list.printList();
        System.out.println("before");
//        list.deleteFront();
        list.deleteAfter(7);
        list.printList();
    }

}
