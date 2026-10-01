public class CircularLinkedList<T> {

    Node<T> dummy;

    public CircularLinkedList(){
        dummy = new Node<T>(null);
        dummy.next = dummy;

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

        while(curr != dummy) {
            System.out.print(curr.getValue()+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void showReverseList(){
        showReverse(dummy.next);
        System.out.println();
    }

    private void showReverse(Node curr){
        if (curr == dummy){
            return;
        }

        showReverse(curr.next);
        System.out.print(curr.value+" ");
    }

    public int find(T t){
        return 0;
    }

    public void remove(T t){

    }
}
