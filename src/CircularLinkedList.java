public class CircularLinkedList<T> {

    Node<T> dummy;

    public CircularLinkedList(){
        dummy = new Node<T>(null);

    }

    public void addItem(T t){
        Node<T> node = new Node<>(t);
        Node<T> curr = dummy;

        while(curr.next != dummy){
            curr = curr.next;
        }

        curr.next = node;
        node.next = dummy;
    }

    public void showList(){

    }

    public void showReverseList(){

    }

    public void find(T t){

    }

    public void remove(T t){

    }
}
