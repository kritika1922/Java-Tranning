
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;

public class DeserializationTest {
	public static void main(String args[]) throws ClassNotFoundException, IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter output file");
		String oputFileName = sc.nextLine().trim();
		FileInputStream file = new FileInputStream(oputFileName);
		ObjectInputStream input = new ObjectInputStream(file);
		List<Student>  list =(List<Student>) input.readObject();
		for(Student student:list) {
			System.out.println(student.name + "  " + student.DOB + "  " + student.address.city + " " + student.address.state
					+ " " + student.address.pincod + " " + student.address.country);
		}
		input.close();
		file.close();
		System.out.println("DeSerialization Done");
	}
}

