package car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameTest {
    @DisplayName("생성")
    @Test
    void create() {
        // given
        // when
        Name name = new Name("car");
        // then
        assertThat(name).isNotNull();
    }

    @DisplayName("생성 실패 - 이름이 5자를 초과")
    @Test
    void createFailed() {
        // given
        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> {
            new Name("lkimilhol");
        });
    }
}