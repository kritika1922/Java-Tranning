 

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializationTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name, DOB, city, state, pincod, country;
		String yes;
		do {

			System.out.println("Take Input from the user:");
			name = sc.nextLine();
			DOB = sc.nextLine();
			city = sc.nextLine();
			state = sc.nextLine();
			pincod = sc.nextLine();
			country = sc.nextLine();

			Address address = new Address(city, state, pincod, country);
			//Address address1 = new Address(city, state, pincod, country);
			//Address address2 = new Address(city, state, pincod, country);
			//Address address3 = new Address(city, state, pincod, country);
			Student student = new Student(name, DOB, address);
			//Student student2 = new Student(name, DOB, address1);
			//Student student3 = new Student(name, DOB, address2);
			//Student student4 = new Student(name, DOB, address3);
			List<Object> list = new ArrayList<Object>();
			list.add(student);
			//list.add(student2);
			//list.add(student3);
			//list.add(student4);

			try {
			        System.out.println("Enter input file");
				String inputFileName= sc.nextLine().trim();
				FileOutputStream file = new FileOutputStream(inputFileName);
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(list);
				out.flush();
				out.close();
				System.out.println("Serialization Done");
			} catch (FileNotFoundException e) {

			} catch (IOException e) {

			}
			System.out.println("do you want to again:");
			 yes = sc.nextLine();

		} while (yes.equals("yes"));
	}

}

