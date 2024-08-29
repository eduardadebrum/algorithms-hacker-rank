package eduarda.brum.warmup;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int quantity = arr.size();

        long positive = arr.stream().filter(number -> number > 0).count();
        long negative = arr.stream().filter(number -> number < 0).count();
        long zero = arr.stream().filter(number -> number == 0).count();

        print(calculateAndFormat(positive, quantity));
        print(calculateAndFormat(negative, quantity));
        print(calculateAndFormat(zero, quantity));
    }

    protected static String calculateAndFormat(long number, Integer quantity) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        return decimalFormat.format((double) number/quantity);
    }

    protected static void print(String message) {
        System.out.println(message);
    }
}