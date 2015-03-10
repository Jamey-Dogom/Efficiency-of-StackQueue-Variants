/**
 * @author your_name
 * This class implements Queue using array list
 */

import java.util.ArrayList;


public class VectorQueue implements Queue{

    private ArrayList<String> items = new ArrayList<String>();

    @Override
    //complexity: O(1)
    public void enqueue(String str) {
        items.add(str); //add to last
    }

    @Override
    //complexity: O(n)
    public String dequeue() {
        return items.remove(0); //remove at first
    }

    @Override
    //complexity: O(1)
    public String peek() {
        return items.get(0);
    }

    @Override
    //complexity: O(1)
    public boolean isEmpty() {
        return items.isEmpty();
    }

}
