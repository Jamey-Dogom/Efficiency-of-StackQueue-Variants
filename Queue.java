public interface Queue {
    public void enqueue(String str);
    public String dequeue();
    public String peek();
    public boolean isEmpty();
}
