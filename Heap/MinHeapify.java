import java.util.*;
class MinHeap {
    int[] arr;
    int size;
    int capacity;

    // Constructor
    MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        arr = new int[capacity];
    }

    // Parent index
    int parent(int i) {
        return (i - 1) / 2;
    }

    // Left child index
    int left(int i) {
        return 2 * i + 1;
    }

    // Right child index
    int right(int i) {
        return 2 * i + 2;
    }

    // Swap two elements
    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Insert an element
    void insert(int x) {
        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }

        int i = size;
        arr[i] = x;
        size++;

        // Move upward
        while (i != 0 && arr[parent(i)] > arr[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Min Heapify
    void minHeapify(int i) {
        int lt = left(i);
        int rt = right(i);

        int smallest = i;

        if (lt < size && arr[lt] < arr[smallest])
            smallest = lt;

        if (rt < size && arr[rt] < arr[smallest])
            smallest = rt;

        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    // Extract Minimum
    int extractMin() {
        if (size <= 0)
            return -1;

        if (size == 1) {
            size--;
            return arr[0];
        }

        int root = arr[0];
        arr[0] = arr[size - 1];
        size--;

        minHeapify(0);

        return root;
    }

    // Print Heap
    void printHeap() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class MinHeapify {
    public static void main(String[] args) {

        MinHeap heap = new MinHeap(10);

        heap.insert(20);
        heap.insert(10);
        heap.insert(15);
        heap.insert(30);
        heap.insert(40);

        System.out.println("Heap after insertion:");
        heap.printHeap();

        System.out.println("Extracted Min: " + heap.extractMin());

        System.out.println("Heap after extractMin:");
        heap.printHeap();
    }
}