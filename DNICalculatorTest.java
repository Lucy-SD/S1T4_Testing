package level1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.level1.exercise2.DNICalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DNICalculatorTest {

    @ParameterizedTest
    @CsvSource({
            //datos correctos
            "12345678, Z",
            "45678912, S",
            "78912345, N",
            "10234057, T",
            "89123456, C"
    })

    void testCorrectDNI(int dniNumber, char letter) {
        DNICalculator dniCalculator = new DNICalculator(dniNumber);
        char realLetter = dniCalculator.calculateDniLetter();
        assertEquals(letter, realLetter, () -> String.format("El DNI nro: %d se corresponde con la letra" +
                " '%c', pero se recibió la '%c'.", dniNumber, realLetter, letter));

    }

    @ParameterizedTest
    @CsvSource({
            //datos incorrectos
            "21542874, A", //Q
            "15484513, M", //Q
            "14783269, F", //L
            "86547221, W", //S
            "77445189, D" //A
    })

    void testIncorrectDNI (int dniNumber, char wrongletter) {
        DNICalculator dniCalculator = new DNICalculator(dniNumber);
        char realLetter = dniCalculator.calculateDniLetter();
        assertNotEquals(wrongletter, realLetter, () -> String.format("El DNI nro: %d se corresponde con la letra" +
                " '%c', pero se recibió la '%c'.", dniNumber, realLetter, wrongletter) );


    }
}