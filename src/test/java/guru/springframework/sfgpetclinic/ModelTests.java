package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

@Tag("model")
public interface ModelTests {

    @BeforeEach
    default void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println("DISPLAY NAME: " + testInfo.getDisplayName());
        System.out.println("REPETITION: " + repetitionInfo.getCurrentRepetition());
    }
}