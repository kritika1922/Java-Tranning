import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Whatever you want");
		System.out.println("Add \nDelete\nSearch\nSort");
		String s = sc.nextLine();
		EmployeeImpl employee = new EmployeeImpl();
		switch (s) {
		case "Add":
			System.out.println("Enter EmployeId,Name,Email,Age And Date of birth");
			String id = sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			String age = sc.nextLine();
			String date = sc.nextLine();
			employee.add(id, name, email, age, date);
			break;
		case "Delete":
			System.out.println("Enter the String you wish to delete ");
			String lineToRemove = sc.nextLine();
			employee.delete(lineToRemove);
			break;
		case "Search":
			System.out.println("Seach String");
			String searchStr = sc.nextLine();
			employee.search(searchStr);
			break;
		case "Sort":
			System.out.println("Sorting in ascending or descending");
			String format = sc.nextLine();
			employee.sort(format);
			break;
		default:
			System.out.println("Somthing went wrong");
			break;
		}
	}

}
