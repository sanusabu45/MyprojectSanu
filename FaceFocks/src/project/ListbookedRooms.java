package project;

public class ListbookedRooms {

	//public static void main(String[] args)
	
		// TODO Auto-generated method stub
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	public void register()
	{
	System.out.println("Your details are");
	System.out.println(name);
	System.out.println(address);
	System.out.println(contactNumber);
	System.out.println(email);
	System.out.println(proofType);
	System.out.println(proofID);


	}

}
       