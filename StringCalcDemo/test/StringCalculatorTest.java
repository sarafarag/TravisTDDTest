import  static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    // The method can take 0, 1, 2 numbers separated by comma
    // Task 1: Test when more than two numbers Throes Exception "Run Time exception"
    @Test
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        assertThrows(RuntimeException.class, () -> {
            StringCalculator.add("1,2,3");
        });
    }
    // Task 2: If it is not a number, parseInt will throw an exception

   @Test
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {

        assertThrows(RuntimeException.class, () -> {
            StringCalculator.add("1,X");
        });
    }
    //Task 3: For an empty string the method will return 0
    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {

        assertEquals(0, StringCalculator.add(""));
    }
// Requirement 2- Allow the Add method to handle new lines between numbers
    @Test
    public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
        assertEquals(21, StringCalculator.add("6\n15"));

    }
}


