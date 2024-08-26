import eduarda.brum.MinMaxValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class MinMaxValueTest {

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void calculate(List<Integer> inputs, String expected) {
        String result = MinMaxValue.miniMaxSum(inputs);
        Assertions.assertEquals(expected, result);
    }


    private static Stream<Arguments> inputsAndResults() {

        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5), "10 14" ),
                Arguments.of(Arrays.asList(7, 69, 2, 221, 8974), "299 9271"),
                Arguments.of(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625), "2063136757 2744467344"),
                Arguments.of(Arrays.asList(140638725, 436257910, 953274816, 734065819, 362748590), "1673711044 2486347135"),
                Arguments.of(Arrays.asList(769082435, 210437958, 673982045, 375809214, 380564127), "1640793344 2199437821"));
    }
}