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

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class HelloParallelStreams {

    public static void main(String[] args) {
        
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        
        sequentialSort(values);  
        parallelSort(values);
    }

    private static void sequentialSort(List<String> values) {
        long t0 = System.nanoTime();
        
        long count = values.stream().sorted().count();
        System.out.println(count);
        
        long t1 = System.nanoTime();
        
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    private static void parallelSort(List<String> values) {
        long t0 = System.nanoTime();
        
        long count = values.parallelStream().sorted().count();
        System.out.println(count);
        
        long t1 = System.nanoTime();
        
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));
    }
}