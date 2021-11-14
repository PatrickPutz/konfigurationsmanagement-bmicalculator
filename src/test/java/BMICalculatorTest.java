import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BMICalculatorTest {

    BMICalculator MaxMustermann;
    BMICalculator SusiSorglos;
    BMICalculator KarlCorona;

    @BeforeEach
    void setUp() {
        MaxMustermann = new BMICalculator("Max", "Mustermann",
                'm', 180, 80);
        SusiSorglos = new BMICalculator("Susi", "Sorglos",
                'f', 174, 52);
        KarlCorona = new BMICalculator("Karl", "Corona",
                'm', 202, 114);
    }

    @Test
    void calculateBMI() {
        Assertions.assertEquals(24.69, MaxMustermann.calculateBMI());
        Assertions.assertEquals(17.18, SusiSorglos.calculateBMI());
        Assertions.assertEquals(27.94, KarlCorona.calculateBMI());
    }

    @Test
    void calculateBMICategory() {
        Assertions.assertEquals(0, MaxMustermann.calculateBMICategory());
        Assertions.assertEquals(-1, SusiSorglos.calculateBMICategory());
        Assertions.assertEquals(1, KarlCorona.calculateBMICategory());
    }

    @Test
    void getBMICategoryName() {
        Assertions.assertEquals("Normalgewicht", MaxMustermann.getBMICategoryName());
        Assertions.assertEquals("Untergewicht", SusiSorglos.getBMICategoryName());
        Assertions.assertEquals("Übergewicht", KarlCorona.getBMICategoryName());
    }
}
