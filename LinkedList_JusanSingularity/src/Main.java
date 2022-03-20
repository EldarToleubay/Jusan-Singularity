//https://gyansetu-core-java-for-java.gitbook.io/project/untitled-1/linkedlist-operations#2-peek-peekfirst-peeklast-display-dont-remove

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("My");
        linkedList.add("name");
        linkedList.add("Eldar");
        System.out.println("_________________________________1 task____________________________________");
        System.out.println("before:");
        System.out.println(linkedList);
        System.out.println("after:");
        linkedList.addLast("Toleubay");
        System.out.println(linkedList);
        System.out.println("_________________________________2 task____________________________________");

        for (String i : linkedList) {
            System.out.println(i);
        }

        System.out.println("_________________________________3 task____________________________________");
        ListIterator<String> iter1 = linkedList.listIterator(1);

        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        System.out.println("_________________________________4 task____________________________________");
        Iterator<String> iter2 = linkedList.descendingIterator();

        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        System.out.println("_________________________________5 task____________________________________");
        System.out.println(linkedList);
        linkedList.add(1, "Dar");
        System.out.println(linkedList);

        System.out.println("_________________________________6 task____________________________________");
        System.out.println(linkedList);
        linkedList.addFirst(">>>");
        linkedList.addLast("<<<");
        System.out.println(linkedList);
        System.out.println("_________________________________7 task____________________________________");
        System.out.println(linkedList);
        linkedList.offerFirst("Leonid");
        System.out.println(linkedList);
        System.out.println("_________________________________8 task____________________________________");
        System.out.println(linkedList);
        linkedList.offerLast("Cionid");
        System.out.println(linkedList);
        System.out.println("_________________________________9 task____________________________________");
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Bye");
        linkedList2.add("Bye");
        linkedList2.add("!");
        System.out.println(linkedList);
        linkedList.addAll((linkedList.size() + 1) / 2, linkedList2);
        System.out.println(linkedList);


        System.out.println("_________________________________10 task____________________________________");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst() + " " + linkedList.getLast()
        );
        System.out.println("_________________________________11 task____________________________________");
        for (String i :
                linkedList) {

            System.out.println(linkedList.indexOf(i) + ":" + i);
        }
        System.out.println("_________________________________12 task____________________________________");
        System.out.println(linkedList);
        linkedList.remove("My");
        System.out.println(linkedList);
        System.out.println("_________________________________13 task____________________________________");
        System.out.println(linkedList);
        linkedList.remove(linkedList.getFirst());
        linkedList.remove(linkedList.getLast());
        System.out.println(linkedList);
        System.out.println("_________________________________14 task____________________________________");
        System.out.println(linkedList);
        linkedList.remove(linkedList.removeAll(linkedList));
        System.out.println(linkedList);

        linkedList.offer("Red");
        linkedList.offer("Blue");
        linkedList.offer("White");
        linkedList.offer("Green");
        linkedList.offer("Black");
        linkedList.offer("Pink");
        System.out.println("_________________________________15 task____________________________________");
        System.out.println(linkedList);
        Collections.swap(linkedList, 0, linkedList.size() - 1);
        System.out.println(linkedList);
        System.out.println("_________________________________16 task____________________________________");
        System.out.println(linkedList);
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
        System.out.println("_________________________________17 task____________________________________");
        LinkedList<String> colors = new LinkedList<>();
        colors.offer("Yellow");
        colors.offer("Purple");
        colors.offer("Orange");
        System.out.println(colors);
        colors.addAll(linkedList);
        System.out.println(colors);
        System.out.println("_________________________________18 task____________________________________");
        LinkedList<String> clone1 = new LinkedList<>();
        clone1 = (LinkedList<String>)colors.clone();

        System.out.println(clone1);

        System.out.println("_________________________________19 task____________________________________");
        System.out.println(colors);
        System.out.println(colors.pop()+" was removed");
        System.out.println(colors);
        System.out.println("_________________________________20 task____________________________________");
        System.out.println(colors);
        System.out.println(colors.peekFirst()+" was retrieved but didn't removed");
        System.out.println(colors);
        System.out.println("_________________________________21 task____________________________________");
        System.out.println(colors);
        System.out.println(colors.peekLast()+" was retrieved but didn't removed");
        System.out.println(colors);

        System.out.println("_________________________________22 task____________________________________");
        System.out.println(colors);
        System.out.println(colors.contains("Red"));
        System.out.println("_________________________________23 task____________________________________");
        List<String> arr = new ArrayList(linkedList);
        for (String i:arr) {
            System.out.println(i);
        }
        System.out.println(linkedList);
        System.out.println("_________________________________24 task____________________________________");
        System.out.println(colors+"=="+linkedList2);
        boolean equals = colors.equals(linkedList2);
        System.out.println(equals);
        System.out.println("_________________________________25 task____________________________________");
        System.out.println("colors is empty??");
        boolean equals1 = colors.isEmpty();
        System.out.println(equals1);
        System.out.println("_________________________________26 task____________________________________");
        System.out.println(colors);
        System.out.println(colors);
        System.out.println("Swap 1 to 3, and 3 to 1");
        String temp = colors.get(1);
        String color = colors.get(3);
        colors.set(1,color);
        colors.set(3,temp);
        System.out.println(colors);
    }
}
