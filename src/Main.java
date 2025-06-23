public class Main {
    public static void main(String[] args) {
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
    }
}