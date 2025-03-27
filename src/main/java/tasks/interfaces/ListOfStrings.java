package tasks.interfaces;

import java.util.List;

public interface ListOfStrings {
    static List<String> contains(List <String> list, String toCheck) {
        return list.stream().filter(s -> s.contains(toCheck)).toList();
    }
    static List<String> withLength(List <String> list, int length) {
        return list.stream().filter(x -> x.length() > length).toList();
    }
}

