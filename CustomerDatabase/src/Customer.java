
public class Customer {

	private Name name;
	private Address address;
	private PhoneNumber phoneNumber;
	private int crewSize;
	
	
	public Customer(Name name, Address address,
			PhoneNumber phoneNumber, int crewSize){
		
		name = this.name;
		address = this.address;
		phoneNumber = this.phoneNumber;
		crewSize = this.crewSize;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString(){ 
		return "Customers name: " + name + "\nCustomers Address: "
			+ address + " \nCustomers PhoneNumber: " + phoneNumber
				+ "\nCrew Size: " + crewSize;
	
	}


}

