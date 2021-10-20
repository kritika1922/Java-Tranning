import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class EmployeeImpl implements Employee {
	public void add(String id, String name, String email, String age, String date) {
		 //output = null;
		try {
			List<List<String>> list1 = new ArrayList<List<String>>();
			List<String> list = new ArrayList<String>();
			list.add(id);
			list.add(name);
			list.add(email);
			list.add(age);
			list.add(date);
			list1.add(list);
			System.out.println(list1);
                       File file = new File("url.txt");
			FileWriter writer = new FileWriter(file, true);
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			BufferedWriter output = new BufferedWriter(writer);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println(list);
			for (List<String> rowData : list1) {
				System.out.println(rowData);
				  writer.write(rowData+ System.lineSeparator());
				System.out.println("Successful Write");
			}
			writer.close();
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("Somthing went wrong");
		}

	}

	public void delete(String lineToRemove) {

		try {
                       File  inputFile = new File("url.txt");
                       File  tempFile = new File("newFile.txt");
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

			String currentLine;

			while ((currentLine = reader.readLine()) != null) {
				String trimmedLine = currentLine.trim();
				if (trimmedLine.startsWith(lineToRemove))
					continue;
				System.out.println(trimmedLine);
				writer.write((currentLine) + System.getProperty("line.separator"));
			}
			writer.close();
			reader.close();
			Files.move(tempFile.toPath(), inputFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		} catch (IOException e) {
			System.out.println("Somthing went wrong");
		}
	}

	public void search(String searchStr) {
		try {
		        File file=new File("url.txt");
			Scanner scan = new Scanner(file);
			while (scan.hasNext()) {
				String line = scan.nextLine().toLowerCase().toString();
				if (line.contains(searchStr)) {
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		}
	}

	public void sort(String format) {

		try {
			File file=new File("url.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> str = new ArrayList<>();
			String line = "";
			while ((line = reader.readLine()) != null) {
				str.add(line);
			}
			reader.close();
			if (format.equalsIgnoreCase("ascending")) {
				Collections.sort(str);
			} else if (format.equalsIgnoreCase("descending")) {
				Collections.reverse(str);
			}
			FileWriter writer = new FileWriter(file);
			for (String s : str) {
				writer.write(s);
				writer.write("\r\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		} catch (IOException e) {
			System.out.println("Somthing went wrong");
		}
	}
}

