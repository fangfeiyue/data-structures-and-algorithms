public class LinearSearch {
    // 将构造函数声明成私有的防止用户创建LinearSearch类的对象
    private LinearSearch() {}
    public static <T> int search(T[] data, T target) {
        for (int i = 0, len = data.length; i < len; i++)
            // data和target都是类对象，所以要用equals来判断不能用==，如果用==判断就是引用是否相等
            if (data[i].equals(target)) return i;
            return -1;
    }

    public static void main(String[] args) {
//        // 这里需要注意search方法是一个泛型方法，接收的参数需要是一个类对象而不能是一个基本数据类型
//        Integer[] data = {1, 3, 5, 6, 7, 8};
//        int res = LinearSearch.<Integer>search(data,6);
//        System.out.println(res); // 3
//
//        int res2 = LinearSearch.<Integer>search(data, 666);
//        System.out.println(res2); // -1
//
//        Student[] students = {new Student("Alice"),
//                new Student("Xiaomi"),
//                new Student("Kites")};
//        Student xiaomi = new Student("Xiaomi");
//        int res3 = LinearSearch.search(students, xiaomi);
//        System.out.println(res3);


//        测试算法性能
        int n = 100000;
        Integer[] arr = ArrayGenerator.generateOrderedArray(n);
        long startTime = System.nanoTime();
        LinearSearch.search(arr, n);
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;
        System.out.println(time + "s");

    }
}
