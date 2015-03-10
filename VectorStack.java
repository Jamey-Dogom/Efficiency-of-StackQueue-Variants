/**
 * @author your_name
 * This class implements Stack using array list
 */
import java.util.ArrayList;


public class VectorStack implements Stack{

    private ArrayList<String> items = new ArrayList<String>();

    @Override
    //complexity: O(1)
    public void push(String str) {
        items.add(str);
    }

    @Override
    //complexity: O(1)
    public String pop() {
        return items.remove( items.size() - 1 );
    }

    @Override
    //complexity: O(1)
    public String peek() {
        return items.get( items.size() - 1 );
    }

    @Override
    //complexity: O(1)
    public boolean isEmpty() {
        return items.isEmpty();
    }

}
