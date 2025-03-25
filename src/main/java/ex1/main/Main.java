package ex1.main;

import ex1.interfaces.Pi;

import java.util.*;

public class Main {

    @FunctionalInterface
    interface PiValue {
        double getPiValue();
    }

    public static void main(String[] args) {
        /*
        Per a tots els exercicis s'ha d'utilitzar l'API de Java Lambdas and Streams de Java 8+.

        - Exercici 1
        A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les
        cadenes que contenen la lletra ‘o’. Imprimeix el resultat.
         - Exercici 2
        Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista
        amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.
        - Exercici 3
        Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista
        amb una lambda.
        - Exercici 4
        Fer la mateixa impressió del punt anterior, però mitjançant method reference.
        - Exercici 5
        Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double.
            Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415.
                Invoca el mètode getPiValue() i imprimeix el resultat.
        - Exercici 6
        Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a
        més llarga.
        */

        /*
        String[] words = {
                "apple", "orange", "table", "ocean", "window",
                "chair", "robot", "mountain", "door", "shadow",
                "pencil", "forest", "laptop", "jellyfish", "tornado"
        };
        System.out.println("Exercici 1");
        List<String> wordsList = Arrays.asList(words);
        List wordsWithLetterO = wordsList.stream()
                .filter(s -> s.contains("o")).toList();

        System.out.println(wordsWithLetterO);

        System.out.println("\nExercici 2");
        List wordsWithLetterOAndMoreThan5Letters = wordsList.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .toList();
        System.out.println(wordsWithLetterOAndMoreThan5Letters);

        System.out.println("\nExercici 3");

        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        months.forEach(month -> System.out.print(month + " "));

        System.out.println("\n\nExercici 4");

        months.forEach(System.out::println);

        System.out.println("\nExercici 5");

        Pi pi1 = new Pi() {
            @Override
            public double getPiValue() {
                return 3.1415;
            }
        };
        Pi pi2 = () -> 3.1415;

        System.out.println(pi1.getPiValue());
        System.out.println(pi2.getPiValue());
*/
        System.out.println("Exercici 6");

        List<Object> mixedList = Arrays.asList(42, "Lambda", 3.14, "Java", 100, "Hello", 7.5, "Stream");

        mixedList.stream().sorted();
        System.out.println(mixedList);

    }
}