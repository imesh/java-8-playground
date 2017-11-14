package imesh.io.java8.playground;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class HelloStreams {
    
    public static void main(String[] args) {
        
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        
        stringCollection.stream()
            .sorted()
            .map(String::toUpperCase)
            .filter((s) -> s.startsWith("a"))
            .forEach(System.out::println);

        boolean anyStartsWithA =
                stringCollection
                .stream()
                .anyMatch((s) -> s.startsWith("a"));
        
        System.out.println(anyStartsWithA);    // true
        
        boolean allStartsWithA =
                stringCollection
                .stream()
                .allMatch((s) -> s.startsWith("a"));
        
        System.out.println(allStartsWithA);    // false
        
        boolean noneStartsWithZ =
                stringCollection
                .stream()
                .noneMatch((s) -> s.startsWith("z"));
        
        System.out.println(noneStartsWithZ);    // true

        long startsWithB =
            stringCollection
            .stream()
            .filter((s) -> s.startsWith("b"))
            .count();
    
        System.out.println(startsWithB);    // 3

        Optional<String> reduced =
            stringCollection
            .stream()
            .sorted()
            .reduce((s1, s2) -> s1 + "#" + s2);
    
        reduced.ifPresent(System.out::println);
        // "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
    }
}