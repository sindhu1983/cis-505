import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CsvUtil {
	
	public static final String FILE_NAME = "./grades.csv";

	public static void saveToCsv (String line) {
		File file = new File(FILE_NAME);
		String header = null;
		if (!file.exists()) {
			Student student = new Student("First Name", "Last Name", "Course", "Grade");
			header = student.toString();
		}
		try (FileWriter fstream = new FileWriter(file, true);BufferedWriter writer = new BufferedWriter(fstream);)  {
			if (header!=null) {
				writer.write(header);
				writer.newLine();
			}
			writer.write(line);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> getDataFromCsv () {
		List<String> list = new ArrayList<>();
		try (BufferedReader br = Files.newBufferedReader(Paths.get(CsvUtil.FILE_NAME))) {
			list = br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

}
