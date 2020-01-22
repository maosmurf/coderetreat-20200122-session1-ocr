import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitParserTest {

    private DigitParser parser;

    @BeforeEach
    void setUp() {
        this.parser = new DigitParser();
    }

    @Test
    public void shouldBeZero() {
        var zero = new String[]{
                " _ ",
                "| |",
                "|_|",
                "   "
        };
        assertEquals(0, parser.parse(zero));
    }
}
