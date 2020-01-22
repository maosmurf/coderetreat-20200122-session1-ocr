import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitParserTest {

    private static DigitParser parser;

    @BeforeAll
    static void beforeAll() {
        parser = new DigitParser();
    }

    @ParameterizedTest(name = "should parse {1}")
    @MethodSource("provideDigitsAndNumbers")
    public void digitShouldEqualInput(String[] input, int digit) {
        assertEquals(digit, parser.parse(input));
    }

    private static Stream<Arguments> provideDigitsAndNumbers() {
        return Stream.of(
                Arguments.of(new String[]{
                        " _ ",
                        "| |",
                        "|_|",
                        "   "
                }, 0),
                Arguments.of(new String[]{
                        "   ",
                        "  |",
                        "  |",
                        "   "
                }, 1)
        );
    }

}
