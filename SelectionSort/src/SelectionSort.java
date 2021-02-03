public class SelectionSort {
    private SelectionSort() {}

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0, len = arr.length; i < len; i ++)
            for (int j = i; j < len; j ++)
                if (arr[j].compareTo(arr[i]) < 0) swap(arr, i, j);
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
//        少量数据排序
        Integer[] arr = {3, 4, 2, 7, 5, 9};
        SelectionSort.sort(arr);

        for (int i: arr) System.out.print(i + " ");

        System.out.println();

//        自定义学生类排序
//        Student[] students = {
//            new Student("f", 88),
//            new Student("k", 78),
//            new Student("g", 100),
//            new Student("d", 150),
//            new Student("z", 66)
//        };
//
//        SelectionSort.sort(students);
//
//        for (Student student: students) System.out.print(student + " ");
//
//        System.out.println();

//        测试选择排序算法的性能
//        int n = 10000;
//        int dataSize[] = { 10000, 100000 };
//
//        for (int n: dataSize) {
//            Integer arr[] = ArrayGenerator.generateRandomArray(n, n);
//            SortingHelper.sortTest("SelectionSort", arr);
//        }
    }
}
