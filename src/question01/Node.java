package question01;

/*
class Node{
 Node next;
 int value;
}
// Your resolution
// Time complexity:
// Space complexity:

Time Complexity: O(n)
Space Complexity: O(1)   No extra space needed.

public Node reverse(Node head){
}

 */

public class Node {
    Node next;
    int value;

    Node(){

    }

    Node(int value){
        this.value = value;
        this.next = null;
    }


    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        // first: save the next node;
        // second: reverse the current node, that is to put prev as the current node's next;
        // third: move to next node, that is to make the current node as prev, and the next node as current
        // forth: return the prev, which will be the current node, when current.next is null, which means
        //        we have reached the end of the original List.
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
