package racingcar;

import java.util.Objects;

import static racingcar.view.CommonMessage.ERROR_MESSAGE_PREFIX;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        validateNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ERROR_MESSAGE_PREFIX + "자동차 이름은 5자 이하여야 한다.");
        }
    }
}
