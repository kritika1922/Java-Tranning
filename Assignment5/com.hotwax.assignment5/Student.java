 
import java.io.Serializable;

public class Student implements Serializable {
	  String name;
	   String DOB;
	 Address address;
	  public Student(String name,String DOB,Address address){
	      this.name=name;
	      this.DOB=DOB;
	      this.address=address;
	  }
	 
	

}

