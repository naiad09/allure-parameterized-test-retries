package hello.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalTime;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MySuperTest {

    @ParameterizedTest(name = "{0}")
    @DisplayName("ParameterizedTest")
    @MethodSource
    void mySuperTest(String caseName, LocalTime localTime) {
    }

    private Stream<Arguments> mySuperTest() {
        return Stream.of(
                Arguments.of("Time now", LocalTime.now()),
                Arguments.of("Time in hour", LocalTime.now().plusHours(1))
        );
    }

}
