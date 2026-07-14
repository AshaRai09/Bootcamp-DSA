import java.util.*;

class MaxHeap {

    int[] heap;
    int size;
    int capacity;

    MaxHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Insert an element
    public void insert(int value) {

        if (size == capacity) {
            System.out.println("Heap is Full");
            return;
        }

        // Step 1: Insert at last position
        heap[size] = value;
        int current = size;
        size++;

        // Step 2: Heapify Up
        while (current > 0) {

            int parent = (current - 1) / 2;

            if (heap[parent] >= heap[current])
                break;

            // Swap
            int temp = heap[parent];
            heap[parent] = heap[current];
            heap[current] = temp;

            current = parent;
        }
    }

    // Print heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        MaxHeap h = new MaxHeap(20);

        h.insert(32);
        h.insert(15);
        h.insert(20);
        h.insert(30);
        h.insert(12);
        h.insert(25);
        h.insert(16);

        System.out.println("Max Heap:");
        h.printHeap();
    }
}