package racingcar.domain;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Position {

    private static final int PASS_CONDITION = 4;
    private int position;

    public Position(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public void update(int number) {
        if (number >= PASS_CONDITION) {
            position++;
        }
    }

    @Override
    public String toString() {
        return IntStream.range(0, position)
                .mapToObj(i -> "-")
                .collect(Collectors.joining(""));
    }
}
