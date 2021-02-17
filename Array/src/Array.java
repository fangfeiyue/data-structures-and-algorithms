public class Array {
    private int[] data;
    // 存放数组中有多少个有效元素
    private int size;

    // 有参数的构造函数，用传入的capacity构造数组
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public Array() {
        this(10);
    }

    // 获取数组中的元素个数
    public int getSize() {
        return size;
    }

    // 获取数组中的容量
    public int getCapacity() {
        return data.length;
    }

    // 数组是否为空
    public boolean isEmpty() {
        return size ==  0;
    }

    // 向数组末尾添加元素
    public void addLast(int e) {
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    // 在指定位置插入特定元素
    public void add(int index, int e) {
        if (size == data.length)
            throw new IllegalArgumentException("AddLast failed. Array is full.");

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        for (int i = size - 1; i >= index; i--)
            data[i+1] = data[i];

        data[index] = e;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append("[");

        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size-1)
                res.append(",");
        }

        res.append("]");
        return res.toString();
    }
}
