package HW7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileJava extends SimpleFileVisitor<Path> {

	static int maxDepth = 6;

	static void showMeStream() throws IOException {
		Path start = Paths.get("C:\\Users\\Виталий\\eclipse-workspace");
		try (Stream<Path> stream = Files.find(start, maxDepth,
				(path, attr) -> String.valueOf(path).endsWith(".java"))) {
			String joined = stream.sorted().map(String::valueOf).collect(Collectors.joining(";\n"));
			System.out.println("Found: \n" + joined);
		}

	}
}
