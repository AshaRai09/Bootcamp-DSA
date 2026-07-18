import java.util.*;
class MinHeap {
    int[] arr;
    int size;

    MinHeap(int[] array) {
        arr = array;
        size = array.length;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Heapify
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

    // Build Heap
    void buildHeap() {

        for (int i = (size / 2) - 1; i >= 0; i--) {
            minHeapify(i);
        }
    }

    void printHeap() {
        for (int x : arr)
            System.out.print(x + " ");
    }
}

public class buildHeap {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 2, 4, 8};

        MinHeap heap = new MinHeap(arr);

        System.out.println("Before Build Heap:");
        heap.printHeap();

        heap.buildHeap();

        System.out.println("\nAfter Build Heap:");
        heap.printHeap();
    }
    
}