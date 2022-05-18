package ss9_ArrayList.baitap.MyLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add(0,"tam");
        list.add(1,"hai");
        list.add(2,"ba");
        list.add(3,"bon");
        list.add(4,"nam");
        list.add(4,"sau");
        list.add(4,"sau");
        list.addLast("tam");
        list.remove(1);
        list.remove("sau");
        System.out.println(list.contains("tam"));
        list.clear();
        list.printList();
    }
}