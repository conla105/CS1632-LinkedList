public class Node<T> {

    T value;
    Node<T> node;

    public Node(T value){
        this.value = value;
        this.node = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }




}
