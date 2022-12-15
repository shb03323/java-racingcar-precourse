package racingcar.view;

import java.util.Map;

public class OutputView {

    private static final String PARTITION = " : ";
    private static final String ONE_MOVE = "-";

    public static void printErrorMessage(String message) {
        System.out.println(message);
    }

    public static void printMoveResult(Map<String, Integer> moveResults) {
        System.out.println("\n실행 결과");
        moveResults.keySet().forEach(
                carName -> System.out.println(carName + PARTITION + ONE_MOVE.repeat(moveResults.get(carName))));
    }
}
