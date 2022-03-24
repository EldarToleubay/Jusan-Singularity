import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
    public static void main(String[] args) {

        System.out.println("---------------------------------Task 1-----------------------------------");
        java.util.PriorityQueue<String> colors = new java.util.PriorityQueue<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("White");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors);

        System.out.println("---------------------------------Task 2-----------------------------------");

        for (String i: colors) {
            System.out.println(i);
        }

        System.out.println("---------------------------------Task 3-----------------------------------");
        java.util.PriorityQueue<String> anotherPQ = new java.util.PriorityQueue<>();

        anotherPQ.addAll(colors);
        System.out.println(anotherPQ);

        System.out.println("---------------------------------Task 4-----------------------------------");
        System.out.println(colors+" <<<<<<<< Orange");
        String newColor = "Orange";
        colors.offer(newColor);
        System.out.println(colors);

        System.out.println("---------------------------------Task 5-----------------------------------");
        System.out.println(anotherPQ);
//        anotherPQ.clear();
        System.out.println(anotherPQ);
        System.out.println("---------------------------------Task 6-----------------------------------");
        System.out.println(colors);
        int sum = colors.size();
        System.out.println(sum);
        System.out.println("---------------------------------Task 7-----------------------------------");

        System.out.println(colors);
        System.out.println(anotherPQ);

        Boolean isEqual = anotherPQ.equals(colors);
        System.out.println(isEqual);

        System.out.println("---------------------------------Task 8-----------------------------------");

        System.out.println(colors);
        System.out.println(colors.poll());

        System.out.println("---------------------------------Task 9-----------------------------------");
        System.out.println(colors);
        String elementRemove = colors.poll();
        colors.remove(elementRemove);
        System.out.println(colors);


        System.out.println("---------------------------------Task 9-----------------------------------");

        List<String> arr = new ArrayList<>(colors);

        for (int i = 0; i < arr.size() ; i++) {
            System.out.print(arr.get(i)+" ");
        }

        System.out.println("---------------------------------Task 10-----------------------------------");

        String colorsString = colors.toString();
        System.out.println("String colorsString = " + colorsString);
    }
}
