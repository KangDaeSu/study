package 배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class 배열제어하기 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 3, 4};
        int[] answer = solution(arr);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] solution(int[] arr) {

        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    // stream 사용 x
/*    private static int[] solution(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }
        return result;
    }*/
}
