package ss9_ArrayList.thuchanh.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(12);
        ll.addFirst(10);
        ll.addFirst(11);

        ll.add(4, 88);
        ll.add(4, 77);
        ll.printList();
    }
}

