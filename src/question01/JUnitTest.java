package question01;

import question01.Node;
import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

    @Test
    public void testNode(){
        Node node = new Node();
        Node head = null;
        Node result = node.reverse(head);
        Assert.assertNull(result);

        head = new Node(0);
        result = node.reverse(head);
        Assert.assertEquals(result, head);

        Node dummyHead = head;
        for(int i = 1; i < 5; i++){
            dummyHead.next = new Node(i);
            dummyHead = dummyHead.next;
        }

        // to save the head. if you do not need the head anymore,
        // you can just use the head to reverse. result = node.reverse(head);

        dummyHead = head;

//        this is to show how does the list look like. No need if you do not need to see it.
//        System.out.println("Original list is: ");
//
//        while(dummyHead != null){
//            System.out.print(dummyHead.value + " -> ");
//            dummyHead = dummyHead.next;
//        }

        result = node.reverse(dummyHead);
        Assert.assertEquals(result.value, 4);
    }
}
