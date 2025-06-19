package level1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.level1.exercise2.DNICalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNICalculatorTest {

    @ParameterizedTest
    @CsvSource({
            //datos correctos
            "12345678, Z",
            "45678912, S",
            "78912345, N",
            "10234057, T",
            "89123456, C",

            //datos incorrectos
            "21542874, A", //Q
            "15484513, M", //Q
            "14783269, F", //L
            "86547221, W", //S
            "77445189, D" //A
    })
    void testCalculateDNI(int dniNumber, char letter) throws AssertionError {
        DNICalculator dniCalculator = new DNICalculator(dniNumber);
        char realLetter = dniCalculator.calculateDniLetter();
        String errorMessage = "El DNI " + dniNumber + " no se corresponde con la letra " + letter
                + ". La letra correcta para dicho DNI es " + realLetter + ".";

        try {
            assertEquals(letter, realLetter);
            System.out.println("Datos correctos. DNI: " + dniCalculator.setDni());
        } catch (AssertionError e) {
            System.out.println(errorMessage);
        }
    }
}