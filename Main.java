import java.util.ArrayList;

class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Get the index of the parent node
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Get the index of the left child node
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    // Get the index of the right child node
    private int rightChild(int index) {
        return 2 * index + 2;
    }

    // Insert a new element into the heap
    public void insert(int element) {
        heap.add(element);
        int currentIndex = heap.size() - 1;

        // Heapify up
        while (currentIndex > 0 && heap.get(currentIndex) < heap.get(parent(currentIndex))) {
            // Swap with the parent node if the current node is smaller
            swap(currentIndex, parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
    }

    // Extract (remove and return) the minimum element from the heap
    public int extractMin() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        if (heap.size() == 1) {
            return heap.remove(0);  // If only one element is present
        }

        int min = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));  // Replace root with the last element

        // Heapify down
        heapify(0);

        return min;
    }

    // Heapify down (used after removing the root)
    private void heapify(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        // If the smallest is not the current node, swap and continue heapifying
        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Check if the heap is empty
    public boolean isEmpty() {
        return heap.size() == 0;
    }

    // Get the size of the heap
    public int size() {
        return heap.size();
    }

    // Print the heap elements (for debugging)
    public void printHeap() {
        System.out.println(heap);
    }
}

public class Main {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);
        minHeap.insert(6);

        System.out.println("Min-Heap:");
        minHeap.printHeap();  // Outputs the heap structure

        System.out.println("Extract Min: " + minHeap.extractMin());  // Should return 1
        System.out.println("Extract Min: " + minHeap.extractMin());  // Should return 3

        minHeap.printHeap();  // Outputs the heap structure after extractions
    }
}
