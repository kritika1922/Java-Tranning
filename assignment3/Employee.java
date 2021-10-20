import java.io.File;

public interface Employee {
	public void add(String id, String name, String email, String age, String date);
	public void delete(String lineToRemove);
	public void search(String searchStr);
	public void sort(String format);

}

