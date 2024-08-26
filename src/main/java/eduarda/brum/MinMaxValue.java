package eduarda.brum;

import java.util.Collections;
import java.util.List;

public class MinMaxValue {

    public static String miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        Long minSum = 0L;
        Long maxSum = 0L;

        for (int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }

        for (int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }

        return minSum+" "+maxSum;
    }
}
