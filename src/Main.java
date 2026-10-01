public class Main {
    static void main() {
        CircularLinkedList<Integer> l = new CircularLinkedList();
        l.addItem(2);
        l.addItem(3);
        l.addItem(1);
        l.addItem(4);

        l.showList();
        l.showReverseList();
        l.showList();



    }
}
