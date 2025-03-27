package tasks.main;

import tasks.interfaces.*;

import java.util.*;

public abstract class Main implements Pi, ListOfStrings, ReverseMethod  {
    public static void  main(String[] args) {
        String[] words = {
                "apple", "orange", "table", "ocean", "window",
                "chair", "robot", "mountain", "door", "shadow",
                "pencil", "forest", "laptop", "jellyfish", "tornado"
        };
        System.out.println("Exercici 1");
        System.out.println(ListOfStrings.contains(Arrays.stream(words).toList(), "o"));

        System.out.println("\nExercici 2");
        ListOfStrings.withLength(Arrays.stream(words).toList(), 5).forEach(System.out::println);

        System.out.println("\nExercici 3");
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        months.forEach(month -> System.out.print(month + " "));
        System.out.println("\n");

        System.out.println("Exercici 4");
        months.forEach(System.out::println);

        System.out.println("\nExercici 5");
        Pi pi = () -> 3.1415;
        System.out.println(pi.getPiValue());

        System.out.println("\nExercici 6");
        List<Object> mixedList = Arrays.asList(42, "Lambda", 3.1415, "Java", 100, "HelloLambdas", 7.5, "Stream");
        mixedList.sort( (x, y) -> Integer.compare(x.toString().length(), y.toString().length()));
        System.out.println(mixedList);

        System.out.println("\nExercici 7");
        mixedList.sort( (x, y) -> Integer.compare(y.toString().length(), x.toString().length()));
        System.out.println(mixedList);

        System.out.println("\nExercici 8");
        String string = "ITAcademy";
        System.out.println(string);
        ReverseMethod reverseMethod = s -> new StringBuilder(s).reverse().toString();

        string = reverseMethod.reverse(string);
        System.out.println(string);

    }
}