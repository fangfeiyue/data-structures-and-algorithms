public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0, len = arr.length; i < len; i++)
            arr[i] = i;

        int[] scores = new int[]{100, 99, 98};
        for (int i = 0, len = scores.length; i < len; i++)
            System.out.println(scores[i]);

        for (int score: scores)
            System.out.println(score);

        scores[0] = 99;

        for (int score: scores)
            System.out.println(score);
    }
}
