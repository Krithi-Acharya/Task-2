package Task2java;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ScoreloggerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFileWrite() throws IOException {
		String file = "test.csv";
		Scorelogger logger = new Scorelogger(file);
		studentDetails s = new studentDetails("Krishna",13,89);
		
		logger.writefile(s);
		
		String content = Files.readString(Path.of(file));
		
		assertTrue(content.contains("Krishna,13,89"));
	}

}
