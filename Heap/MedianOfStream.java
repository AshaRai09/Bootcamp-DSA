import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {
   PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap =
            new PriorityQueue<>();

    public void addNum(int num) {

        if(maxHeap.isEmpty() || num<=maxHeap.peek())
            maxHeap.add(num);
        else
            minHeap.add(num);

        if(maxHeap.size()>minHeap.size()+1)
            minHeap.add(maxHeap.poll());

        else if(minHeap.size()>maxHeap.size()+1)
            maxHeap.add(minHeap.poll());
    }

    public double findMedian() {

        if(maxHeap.size()==minHeap.size())
            return (maxHeap.peek()+minHeap.peek())/2.0;

        if(maxHeap.size()>minHeap.size())
            return maxHeap.peek();

        return minHeap.peek();
}
}
