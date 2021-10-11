 import java.io.Serializable;
public class Address implements Serializable{
	 String city;
	 String state;
	 String pincod;
	 String country;
	 public Address(String city,String state,String pincod,String country){
	      this.city=city;
	      this.state=state;
	      this.pincod=pincod;
	      this.country=country;
	 }
	 
}

