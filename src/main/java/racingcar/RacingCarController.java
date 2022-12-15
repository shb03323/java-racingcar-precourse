package racingcar;

import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarController {

    public void run() {
        setCars();
    }

    private void setCars() {
        String carsInput = InputView.inputCars();
        List<String> carsName = splitCarsInput(carsInput);
        CarRepository.makeCars(carsName);
    }

    private List<String> splitCarsInput(String input) {
        return Arrays.stream(input.split(","))
                .collect(Collectors.toUnmodifiableList());
    }
}
