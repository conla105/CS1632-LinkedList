import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {

    @Test
    void addItem() {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList();
        circularLinkedList.addItem(2);

        assertEquals(0, circularLinkedList.find(2));

    }

    @Test
    void showList() {
    }

    @Test
    void showReverseList() {
    }

    @Test
    void find() {
    }

    @Test
    void remove() {
    }
}