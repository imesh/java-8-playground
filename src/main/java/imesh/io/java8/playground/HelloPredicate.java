package imesh.io.java8.playground;

import java.util.function.Predicate;

public class HelloPredicate {

    public static void main(String[] args) {
        
        Predicate<String> predicate = (s) -> s.length() > 0;

        System.out.println(predicate.test("foo"));
        System.out.println(predicate.negate().test("foo"));
    }
}