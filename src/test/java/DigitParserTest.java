import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitParserTest {

    @Test
    public void shouldBeZero() {
        var zero = new String[]{
                " _ ",
                "| |",
                "|_|",
                "   "
        };

        int digit = new DigitParser().parse(zero);
        assertEquals(0, digit);
    }
}
