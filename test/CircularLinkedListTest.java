import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.addItem(44);
        circularLinkedList.addItem(22);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        circularLinkedList.showList();

        assertEquals("44 22 "+System.lineSeparator(), output.toString());
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