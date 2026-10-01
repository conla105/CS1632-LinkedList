public class Main {
    static void main() {
        CircularLinkedList<Integer> l = new CircularLinkedList();
        l.addItem(2);
        l.addItem(3);
        l.addItem(1);
        l.addItem(4);

        l.showList();
        l.showReverseList();
        System.out.println(l.find(2));
        System.out.println(l.find(3));
        System.out.println(l.find(1));
        System.out.println(l.find(4));
        System.out.println(l.find(5));

        l.remove(1);
        l.showList();
        l.showReverseList();
        System.out.println(l.find(4));


    }
}
