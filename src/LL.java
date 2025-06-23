public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){ // THAT IS THE LIST ONLY HAS 1 ELEM SO BOTH HEAD AND TAIL WILL BE EQUAL
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = head; // THIS IS INDEX 0 SO IN LOOP WILL START FROM 1
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next); // WE HAVE A SAME CONSTRUCTOR BELOW
        // here temp will be the i<index so temp.next will be the index in which we want to insert
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        size--;
        if(head==null){
            tail = null; // if there is only 1 elem then along with the head the tail should also be null
        }
        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2); // we need to get to point to the second last elem so that we can point it to null
        int val = tail.value; // the value of the last elem that is being deleted
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void display(){
        Node temp = head; // THIS TEMP WILL POINT TO HEAD
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next; //TEMP WILL NOW POINT TO THE NEXT ELEM
        }
        System.out.println("end");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
