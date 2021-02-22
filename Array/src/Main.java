public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<Integer>(4);

        for (int i = 0; i < 4; i++)
            // 数组末尾依次添加
            arr.addLast(i);

        System.out.println(arr);

        arr.removeLast();
        arr.removeLast();

        System.out.println(arr);
//        arr.addLast(10);
//        System.out.println(arr);
    }
}
