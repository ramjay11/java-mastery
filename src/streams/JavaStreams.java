package streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) throws IOException {

		// 1. Integer Stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
		System.out.println();
		// 2. Integer Stream with skip
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));
		System.out.println();
		// 3. Integer Stream with sum
		System.out.println(
		IntStream
			 .range(1, 5)
			 .sum());
		System.out.println();
		// 4. Stream.of, sorted and findFirst
		Stream.of("Huskey", "Saint", "Siber")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
		// 5. Streams from Array, sort, filter and print
		String[] names = {"Huskey", "Saint", "Siber"};
		Arrays.stream(names) // same as Stream.of(names)
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(System.out::println);

	}
}
