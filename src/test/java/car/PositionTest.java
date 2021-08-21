package car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PositionTest {

    @DisplayName("생성")
    @Test
    void create() {
        // given
        Position position = new Position(1);
        // when
        // then
        assertThat(position).isNotNull();
    }

    @DisplayName("생성 실패")
    @Test
    void createFailed() {
        // given
        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> {
            new Position(-1);
        });
    }
}