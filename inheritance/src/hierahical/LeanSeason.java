package hierahical;

public class LeanSeason extends Booking {

	//public static void main(String[] args) 
	
		// TODO Auto-generated method stub
		int month;
		int discount;
		double roomBooking(int person, int total_days, double tariff, String roomtype,int month,int discount)
		{

		double total=super.roomBooking(person, total_days, tariff, roomtype);
		double amount=total*discount/100;

		return total-amount;


	

}}
