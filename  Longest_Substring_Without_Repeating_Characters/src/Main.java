// https://gyansetu-core-java-for-java.gitbook.io/project/untitled-1/creating-and-using-list-set-and-deque-implementations/arraylist

import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("----------------------------1task----------------------------");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println("----------------------------2task----------------------------");

        for (String i : colors) {
            System.out.println(i);
        }
        System.out.println("----------------------------3task----------------------------");
        colors.set(0, "white");
        System.out.println(colors);
        System.out.println("----------------------------4task----------------------------");
        System.out.println(colors.get(2));
        System.out.println("----------------------------5task----------------------------");
        System.out.println(colors);
        int color1 = colors.indexOf("yellow");
        int color2 = colors.indexOf("black");
        String temp = colors.get(color1);
        colors.set(color1, colors.get(color2));
        colors.set(color2, temp);
        System.out.println(colors);
        System.out.println("----------------------------6task----------------------------");
        System.out.println(colors);
        colors.remove(2);
        System.out.println(colors);
        colors.add(2, "green");
        System.out.println("----------------------------7task----------------------------");

        System.out.print("Введите цвет:");
        String colorToSearch = "Blue";//= in.next();
        if (colors.contains(colorToSearch)) {
            System.out.println("Цвет: \"" + colorToSearch + "\" находится в " + colors.indexOf(colorToSearch) + " индексе");
            System.out.println(colors);
        } else {
            System.out.println("Цвет: \"" + colorToSearch + "\" не найден " + colors.indexOf(colorToSearch) + " индексе");
        }

        System.out.println("----------------------------8task----------------------------");
        List<Character> alphabet = new ArrayList<>();
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('y');
        alphabet.add('u');
        alphabet.add('a');
        alphabet.add('n');
        alphabet.add('e');
        alphabet.add('b');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        System.out.println(alphabet);
        Collections.sort(alphabet);
        System.out.println(alphabet);

        System.out.println("----------------------------9task----------------------------");
        List<Character> copyOfAlphabet = new ArrayList<>();

        Collections.copy(alphabet, copyOfAlphabet);

        System.out.println("alphabet list:" + alphabet + "\ncopyOfAlphabet list with elements of alphabet:" + copyOfAlphabet);
        System.out.println("----------------------------10task----------------------------");
        System.out.println(alphabet);
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println("----------------------------11task----------------------------");
        Collections.sort(alphabet);
        System.out.println(alphabet);
        Collections.reverse(alphabet);
        System.out.println(alphabet);

        System.out.println("----------------------------12task----------------------------");
        System.out.println(alphabet);
        List<Character> alphabetPortion = alphabet.subList(4, 10);
        System.out.println("alphabetPortion's elements from 4 - 10" + alphabetPortion);
        System.out.println("----------------------------13task----------------------------");
        boolean equals = alphabet.equals(copyOfAlphabet);
        System.out.println(equals);
        System.out.println("----------------------------14task----------------------------");
        System.out.println(alphabet);
        Collections.swap(alphabet, 1, 6);
        System.out.println(alphabet);
        System.out.println("----------------------------15task----------------------------");
        System.out.println(alphabet);
        alphabet.addAll(copyOfAlphabet);
        System.out.println(alphabet);
        System.out.println("----------------------------16task----------------------------");
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("E");
        str1.add("l");
        str1.add("d");
        str1.add("a");
        str1.add("r");
        System.out.println(str1);
        ArrayList<String> str2 = (ArrayList<String>) str1.clone();
        System.out.println("Clone of str1 : " + str2);
        System.out.println("----------------------------17task----------------------------");
        str2.clear();
        System.out.println(str2);
        System.out.println("----------------------------18task----------------------------");
        boolean isEmpty = str2.isEmpty();
        System.out.println(isEmpty);
        System.out.println("----------------------------19task----------------------------");
        System.out.println(str1);
        str1.trimToSize();
        System.out.println(str1);
        System.out.println("----------------------------20task----------------------------");
        List<String> animals = new ArrayList<String>(1);
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        ((ArrayList<String>) animals).ensureCapacity(4);
        System.out.println(animals);
        System.out.println("----------------------------21task----------------------------");
        animals.set(1, "cat");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println("----------------------------22task----------------------------");
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i));
        }
    }
}
