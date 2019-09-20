package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

public class MainCus {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String i;
		int booking[];
		booking=new int[25];
		Date date;
		
		do {


			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			name=br.readLine();
			address=br.readLine();
			contactNumber=br.readLine();
			email=br.readLine();
			proofType=br.readLine();
			proofID=br.readLine();
			 ListbookedRooms cu=new  ListbookedRooms();
			cu.setName(name);
			cu.setAddress(address);
			cu.setContactNumber(contactNumber);
			cu.setEmail(email);
			cu.setProofType(proofID);
			cu.setProofID(proofID);
			cu.register();
			int regID = 0;
			System.out.println("Your regID"+ ++regID);
			System.out.println("Do you want continue?");
			i=br.readLine();

			}while(i.equals("Y"));

		RoomBooking b=new RoomBooking();
			b.Booking();


	}

}
