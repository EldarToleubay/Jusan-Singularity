import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOpTest {
    MathOpTest() {

    }

    @Test
    void twoPlusTwoEqualFour() {
        var calculator = new MathOp();
        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void fivePlusThreeEqualFour() {
        var calculator = new MathOp();
        Assertions.assertEquals(8, calculator.add(5, 3));
    }

    @Test
    void nineDivideThreeEqualThree() {
        var calculator = new MathOp();
        Assertions.assertEquals(3, calculator.divide(9, 3));
    }

    @Test
    void squareOfFiveIsTwentyFive() {
        var calculator = new MathOp();
        Assertions.assertEquals(25, calculator.pow(5));
    }

}