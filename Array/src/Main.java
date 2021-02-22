public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<Integer>(30);

        for (int i = 0; i < 10; i++)
            // 数组末尾依次添加
            arr.addLast(i);

        System.out.println(arr);
        /*
        输出
        Array: size = 10, capacity = 30
        [0,1,2,3,4,5,6,7,8,9]
        */

        // 向索引1的位置插入20
        arr.add(1, 20);
        System.out.println(arr);
        /*
        Array: size = 11, capacity = 30
        [0,20,1,2,3,4,5,6,7,8,9]
        */

        arr.addFirst(-1);
        System.out.println(arr);
        /*
        输出
        Array: size = 12, capacity = 30
        [-1,0,20,1,2,3,4,5,6,7,8,9]
        */

        arr.remove(2);
        System.out.println(arr);
        /*
        Array: size = 11, capacity = 30
        [-1,0,1,2,3,4,5,6,7,8,9]
        */

        arr.removeEle(-1);
        System.out.println(arr);
        /*
        Array: size = 10, capacity = 30
        [0,1,2,3,4,5,6,7,8,9]
        */

        arr.removeFirst();
        System.out.println(arr);
        /*
        Array: size = 9, capacity = 30
        [1,2,3,4,5,6,7,8,9]
        */
    }
}
