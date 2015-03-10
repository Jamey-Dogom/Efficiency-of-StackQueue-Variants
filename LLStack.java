/**
 * @author your_name
 * This class implements Stack using single linked list
 */
public class LLStack implements Stack{

    private SingleLinkedList items = new SingleLinkedList();

    @Override
    //complexity: O(1)
    public void push(String str) {
        items.addFirst(str);
    }

    @Override
    //complexity: O(1)
    public String pop() {
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
