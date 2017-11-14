package imesh.io.java8.playground;

@FunctionalInterface
/**
 * Converter<F, T>
 */
interface Converter<F, T> {
    T convert(F from);
}

public class HelloFunctionInterface {

    public static void main(String[] args) {
        
        // Option 1
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("1234");
        System.out.println("Converted: " + converted); 

        // Option 2
        converter = Integer::valueOf;
        converted = converter.convert("1234");
        System.out.println("Converted: " + converted); 
    }
}