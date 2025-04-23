package 배열;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[3];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (answers[i] == patterns[j][i % patterns[j].length]){
                    scores[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (maxScore == scores[i]) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 방법 2
    /*public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % 5]) score[0]++;
            if (answers[i] == supo2[i % 8]) score[1]++;
            if (answers[i] == supo3[i % 10]) score[2]++;
        }

        int maxScore = Arrays.stream(score).max().getAsInt();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (maxScore == score[i]) {
                result.add(i + 1);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }*/

}
