//46. Delete at specific position in circular queue
import java.util.*;

public class DeleteAtSpecificPositionC {

    static void deleteAtPosition(int[] queue, int size, int pos) {

        if (pos < 1 || pos > size) {
            System.out.println("Invalid Position");
            return;
        }

        // Shift elements left
        for (int i = pos - 1; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }

        size--;

        System.out.println("Queue after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] queue = {10, 20, 30, 40, 50};
        int size = 5;
        int pos = 3;

        deleteAtPosition(queue, size, pos);
    }
}