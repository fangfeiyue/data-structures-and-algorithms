public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public  int compareTo(Student another) {
        return another.score - this.score;
    }

    @Override
    public boolean equals(Object student) {
        if (this == student)
            return true;
        if (student == null)
            return false;
        if (this.getClass() != student.getClass())
            return false;

        Student another = (Student) student;
        return this.score == another.score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<Student>();

        arr.addLast(new Student("fang", 100));
        arr.addLast(new Student("fei", 100));
        arr.addLast(new Student("yue", 100));

        System.out.println(arr);
        /*
        输出
        Array: size = 3, capacity = 10
        [Student(name: fang, score: 100),Student(name: fei, score: 100),Student(name: yue, score: 100)]
        */
    }
}
