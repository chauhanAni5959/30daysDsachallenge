import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List {

    Node head;
    private int size;

    Linked_List(){
        size = 0;

    }
    public class Node {

        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            return;
        }
        Node lastNode = head;
        while(lastNode != null){
            lastNode = lastNode.next;

        }
        lastNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Empty list!");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

    }
    public int getSize(){
        return size;
    }

    public void ReverseIteration(){
        if(head == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

//            update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node ReverseRecursion(Node head){
       if(head == null || head.next == null){
           return head;
       }
        Node newHead = ReverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }



    public static void main(String[] args) {
        Linked_List l = new Linked_List();
        l.addFirst("1");
        l.addFirst("2");
        l.addFirst("3");
        l.addFirst("4");
        l.addFirst("5");
        l.addFirst("6");
        l.printList();
        l.ReverseIteration();
        l.printList();





    }


}
