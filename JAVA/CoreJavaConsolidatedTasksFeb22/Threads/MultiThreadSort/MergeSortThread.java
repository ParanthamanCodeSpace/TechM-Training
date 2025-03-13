// MergeSortThread class for multi-threaded sorting
class MergeSortThread extends Thread {
    private int[] array;

    public MergeSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        mergeSort(array);
    }

    // Merge Sort function
    private void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Create two threads for sorting the left and right halves
        MergeSortThread leftSorter = new MergeSortThread(left);
        MergeSortThread rightSorter = new MergeSortThread(right);

        leftSorter.start();
        rightSorter.start();

        try {
            leftSorter.join();
            rightSorter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Merge the sorted halves
        merge(arr, left, right);
    }

    // Merge function
    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
