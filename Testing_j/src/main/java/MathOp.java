import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MathOp {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int pow(int a) {
        return a * a;
    }

    public static LinkedList<Integer> middleOfLinked(LinkedList head) {

        LinkedList<Integer> result = new LinkedList<>();

        int secondPointer = 0;

        for (int i = 0; i < head.size() + 1; i += 2) {
            if (secondPointer < head.size()) {
                secondPointer++;
            }
        }

        for (int i = secondPointer; i <= head.size(); i++) {
            result.add(i);
        }
        return result;
    }

    public static int toUSD(Wallet balance){
        return balance.usd*433;
    }
    public static void main(String[] args) {


        LinkedList<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);
        head.add(6);
        System.out.println(middleOfLinked(head));


    }

}
