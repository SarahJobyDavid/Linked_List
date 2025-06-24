import java.util.List;

public class CycleQs {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //FINDING LENGTH OF THE CYCLE
    public int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                // CALCULATING THE LENGTH
                ListNode temp = slow;
                int length =0;
                do{
                    temp = temp.next;
                    length++;
                }
                while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head){
        int length =0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        // FINDING THE START
        ListNode first = head;
        ListNode second = head;

        while(length > 0){
            second = second.next;
            length--;
        }

        // NOW IF WE MOVE BOTH POINTER FORWARD AND THEY WILL MEET AT THE STARTING POINT
        while( first != second){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
