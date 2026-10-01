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
        Node<T> curr = dummy.next;

        while(curr.next != dummy){
            System.out.println(curr.getValue());
            curr = curr.next;
        }
    }

    public void showReverseList(){

    }

    public void find(T t){

    }

    public void remove(T t){

    }
}
