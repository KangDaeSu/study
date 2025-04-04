package 배열;

import java.util.Arrays;

public class 배열정렬하기 {
    public static void main(String[] args) {
        int[] arr = {1, -5, 2, 4, 3};
        int[] sorted = solution(arr);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] solution(int[] arr) {
        Arrays.sort(arr);

        return arr;
    }
}
