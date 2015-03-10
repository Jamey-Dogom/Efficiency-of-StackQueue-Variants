/**
 * @author your_name
 * This class represent for a node in single linked list
 */
public class Node {
    private String data;
    private Node next;


    public Node(String _data)
    {
        data = _data;
        next = null;
    }

    //get the node data
    public String getData()
    {
        return data;
    }

    //set the node data
    public void setData(String _data)
    {
        data = _data;
    }

    //get the next node
    public Node getNext()
    {
        return next;
    }

    //set the next node
    public void setNext(Node _next)
    {
        next = _next;
    }

}
