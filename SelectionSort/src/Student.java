public class Student implements Comparable<Student> {
    private int score;
    private String name;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(Student another) {
        return this.score - another.score;
    }
    @Override
    public String toString() {
        return String.format("Student(name %s, score %d)", name, score);
    }
}
