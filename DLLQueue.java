/**
 * @author your_name
 * This class implements Queue using double linked list
 */
import java.util.LinkedList;


public class DLLQueue implements Queue {

    private LinkedList<String> items = new LinkedList<String>();

    @Override
    //complexity: O(1)
    public void enqueue(String str) {
        items.addLast(str);
    }

    @Override
    //complexity: O(1)
    public String dequeue() {
        return items.removeFirst();
    }

    @Override
    //complexity: O(1)
    public String peek() {
        return items.getFirst();
    }

    @Override
    //complexity: O(1)
    public boolean isEmpty() {
        return items.isEmpty();
    }

}
