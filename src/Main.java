public class Main {
    public static void main(String[] args) {

        int[] my_array = {98, 63, -8, 0, 672, 6, 765, 6};
        System.out.print("{");
        for (int i = 0; i < my_array.length - 1; i++) {
            System.out.print(my_array[i] + ", ");
        }
        System.out.print(my_array[my_array.length - 1]);
        System.out.println("}");

        HeapSort.heapSort(my_array);

        System.out.println(" ----------<HeapSort>---------- ");
        System.out.print("{");
        for (int i = 0; i < my_array.length - 1; i++) {
            System.out.print(my_array[i] + ", ");
        }
        System.out.print(my_array[my_array.length - 1]);
        System.out.print("}");
    }
}