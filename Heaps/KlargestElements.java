import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {

	public static ArrayList<Integer> kLargest(int n, int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;

        while (i < n) {
            if (minHeap.size() == k && minHeap.peek() < arr[i]) minHeap.poll();
            if (minHeap.size() < k)
                minHeap.offer(arr[i]);
            i++;
        }

        while (!minHeap.isEmpty()) {
            res.add(minHeap.poll());
        }

        return res;

	}
}