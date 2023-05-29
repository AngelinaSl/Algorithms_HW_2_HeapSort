public class HeapSort {
    public static void heapSort(int[] my_array) {

        int l = my_array.length;
        for (int i = l / 2 - 1; i >= 0; i--) {
            heapify(my_array, i, l);
        }
        for (int i = l - 1; i >= 0; i--) {
            int temp = my_array[i];
            my_array[i] = my_array[0];
            my_array[0] = temp;

            heapify(my_array, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int l) {

        int child_index_1 = i * 2 + 1;
        int child_index_2 = i * 2 + 2;
        int parent_index = i;

        if (child_index_1 < l && arr[child_index_1] > arr[parent_index])
            parent_index = child_index_1;

        if (child_index_2 < l && arr[child_index_2] > arr[parent_index])
            parent_index = child_index_2;

        if (i != parent_index) {
            int temp = arr[i];
            arr[i] = arr[parent_index];
            arr[parent_index] = temp;

            heapify(arr, parent_index, l);
        }
    }
}
