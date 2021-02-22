public class Array<E> {
    private E[] data;
    // 存放数组中有多少个有效元素
    private int size;

    // 有参数的构造函数，用传入的capacity构造数组
    public Array(int capacity) {
        //data = new E[capacity]; 不支持new一个泛型数组
        data = (E[])new Object[capacity];
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
    public void addLast(E e) {
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    // 在指定位置插入特定元素
    public void add(int index, E e) {
        if (size == data.length)
            throw new IllegalArgumentException("AddLast failed. Array is full.");

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        data[index] = e;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        E res = data[index];
        for (int i = index; i < size; i++)
            data[i] = data[i + 1];

        size--;
        data[size] = null;
        return res;
    }

    // 删除数组中的第一个元素
    public E removeFirst() {
        return remove(0);
    }

    // 删除数组中的最后一个元素
    public E removeLast() {
        return remove(size - 1);
    }

    // 从数组中删除某个元素
    public void removeEle(E e) {
        int index = findIndex(e);

        if (index != -1)
            remove(index);
    }

    // 获取数组中指定位置的值
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");

        return data[index];
    }

    // 修改指定位置的值
    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is illegal.");

        data[index] = e;
    }

    // 数组中是否包含某个元素
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (data[i].equals(e))
                return true;
        return false;
    }

    // 查找特定元素所在的索引
    public int findIndex(E e) {
        for (int i = 0; i < size; i++)
            if (data[i].equals(e))
                return i;
        return -1;
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
