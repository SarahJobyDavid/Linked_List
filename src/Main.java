public class Main {
    public static void main(String[] args) {
        //SINGLY LINKED LIST
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(90);
        list.insertLast(909);

        list.insert(100, 3);

        list.display();
        list.deleteFirst();
        System.out.println("first is deleted");
        list.display();
        System.out.println("last is deleted");
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(1));
        list.display();

        // DOUBLY LINKED LIST
        DoublyLL list2 = new DoublyLL();
        list2.insertFirst(31);
        list2.insertFirst(23);
        list2.insertFirst(58);
        list2.insertFirst(96);
        //list2.insertLast(90);
        list2.display();

    }
}