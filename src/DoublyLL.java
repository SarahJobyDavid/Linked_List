public class DoublyLL {

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println();

    }
    // REVERSING THE LINKED LIST AND DISPLAYING IT
    public void displayRev(){
        Node node = head;
        Node tail = null;
        while(node != null){
            tail = node;   //THIS WILL ITERATE TILL THE LAST ELEM
            node = node.next;  // THIS WILL ITERATE TILL NULL
        }
        System.out.println("List in Reverse");
        while(tail != null){
            System.out.print(tail.val+"->");
            tail = tail.prev;
        }
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
