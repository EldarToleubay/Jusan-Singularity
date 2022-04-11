import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.*;

import java.util.LinkedList;

class MathOpTest {
    MathOpTest() {

    }

    @Before
    public LinkedList init() {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        return a;
    }

    public LinkedList init2() {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(3);
        a.add(4);
        a.add(5);
        return a;
    }



    @Test
    @DisplayName("2+2=4")
    void twoPlusTwoEqualFour() {
        var calculator = new MathOp();
        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("5+3=8")
    void fivePlusThreeEqualEight() {
        var calculator = new MathOp();
        Assertions.assertEquals(8, calculator.add(5, 3));
    }

//    @Test
    @Ignore
    @DisplayName("9/3=3")
    void nineDivideThreeEqualThree() {
        var calculator = new MathOp();
        Assertions.assertEquals(4, calculator.divide(9, 3));
    }

    @Test
    @DisplayName("5^2=25")

    void squareOfFiveIsTwentyFive() {
        var calculator = new MathOp();
        Assertions.assertEquals(25, calculator.pow(5));
    }

    @Test
    @DisplayName("Middle of LinkedList is 3,4,5")
    void midleOfLinkedListIsFour() {
        var calculator = new MathOp();
        Assertions.assertEquals(init2(), calculator.middleOfLinked(init()));
    }
    @Test
    void OneUSDisFourHundred() {
        var calculator = new MathOp();
        Assertions.assertEquals(2165, calculator.toUSD(new Wallet(5)));
    }

}