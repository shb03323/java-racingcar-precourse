package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarController {

    private final TrialCounter trialCounter;

    public RacingCarController() {
        this.trialCounter = new TrialCounter();
    }

    public void run() {
        initiation();
        while (!trialCounter.isFinish()) {
            move();
        }
    }

    private void initiation() {
        setCars();
        setTrialCount();
    }

    private void setCars() {
        try {
            String carsInput = InputView.inputCars();
            List<String> carsName = splitCarsInput(carsInput);
            CarRepository.makeCars(carsName);
        } catch (IllegalArgumentException exception) {
            OutputView.printErrorMessage(exception.getMessage());
            setCars();
        }
    }

    private void setTrialCount() {
        try {
            int trialInput = InputView.inputTrialCount();
            trialCounter.initTrialCount(trialInput);
        } catch (IllegalArgumentException exception) {
            OutputView.printErrorMessage(exception.getMessage());
            setTrialCount();
        }
    }

    private void move() {

    }

    private List<String> splitCarsInput(String input) {
        return Arrays.stream(input.split(","))
                .collect(Collectors.toUnmodifiableList());
    }
}
