package imesh.io.java8.playground;

import java.util.Optional;

public class HelloOptional {

    public static void main(String[] args) {
        
        Optional<String> optionalStr = Optional.of("Hello optional!");

        System.out.println("is present: " + optionalStr.isPresent());
        System.out.println("get: " + optionalStr.get());
        System.out.println("or else: " + optionalStr.orElse("fallback"));

        optionalStr.ifPresent((s) -> System.out.println("char at 0: " + s.charAt(0)));
    }
}