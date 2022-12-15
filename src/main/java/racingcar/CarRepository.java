package racingcar;

import java.util.ArrayList;
import java.util.List;

import static racingcar.view.CommonMessage.ERROR_MESSAGE_PREFIX;

public class CarRepository {

    private static final List<Car> cars = new ArrayList<>();

    public static void makeCars(List<String> carsName) {
        validateOverlappedName(carsName);
        carsName.forEach(carName -> cars.add(new Car(carName)));
    }

//    public static Map<String, Integer> move() {
//
//    }

//    public static List<String> getWinners() {
//
//    }

    private static void validateOverlappedName(List<String> names) {
        long distinctNamesCount = names.stream()
                .distinct()
                .count();
        if (distinctNamesCount != names.size()) {
            throw new IllegalArgumentException(ERROR_MESSAGE_PREFIX + "중복된 자동차 이름이 있습니다.");
        }
    }
}