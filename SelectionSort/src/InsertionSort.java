public class InsertionSort {
    private InsertionSort() {}
    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0, len = arr.length; i < len; i++)
            for (int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j--)
                swap(arr, j, j - 1);
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
//        基本测试
        Integer arr[] = {3, 2, 1, 7};
        InsertionSort.sort(arr);
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

//        int data[] = { 10000, 100000 };
//        for (int n : data) {
//            Integer arr[] = ArrayGenerator.generateRandomArray(n, n);
//            SortingHelper.sortTest("InsertionSort", arr);
//        }
    }
}
