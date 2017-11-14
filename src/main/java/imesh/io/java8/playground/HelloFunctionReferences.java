package imesh.io.java8.playground;

import java.util.function.Function;

public class HelloFunctionReferences {

    public static void main(String[] args) {
        
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<Integer, String> backToString = String::valueOf;

        Integer intValue = toInteger.apply("123");
        System.out.println(intValue.getClass().getName() + ": " + intValue);
        String stringValue = backToString.apply(intValue);
        System.out.println(stringValue.getClass().getName() + ": " + stringValue);
    }
}