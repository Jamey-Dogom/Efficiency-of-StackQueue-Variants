/**
 * @author your_name
 * This class represent for single linked list
 */

import java.util.HashSet;
import java.util.Set;


public class SingleLinkedList {
    private Node head;
    private Node tail;

    //construct an emptylist
    public SingleLinkedList()
    {
        head = null;
        tail = null;
    }

    //return true if the list is empty
    public boolean isEmpty()
    {
        return head == null;
    }

    //append data to the end of list
    //complexity: O(1)
    public void addLast(String data)
    {
        if ( head == null )
        {
            tail = head = new Node(data);
        }
        else
        {
            //append the new node to the last node
            Node node =new Node(data);
            tail.setNext( node );
            tail = node;
        }
    }

    //add data to the first of list
    //complexity: O(1)
    public void addFirst(String data)
    {
        if ( head == null )
        {
            head = new Node(data);
        }
        else
        {
            Node node = new Node(data);
            node.setNext(head);
            head = node;
        }
    }


    //remove and return the data in the first node
    //complexity: O(1)
    public String removeFirst()
    {
        if ( head == null ) return null;
        String data = head.getData();
        head = head.getNext();
        if ( head == null )
        {
            tail = null;
        }
        return data;
    }

    //return the data in the first node
    public String getFirst()
    {
        if ( head == null ) return null;
        return head.getData();
    }
}
