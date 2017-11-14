/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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