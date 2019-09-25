package hierahical;

public class PeakSeason extends Booking {

	//public static void main(String[] args)
	
		// TODO Auto-generated method stub
		 
			int month;
			int peakcharge;
			double roomBooking(int person, int total_days, double tariff, String roomtype,int month,int peakcharge)
			{
			double total=super.roomBooking(person, total_days, tariff, roomtype);
			double amount=(total*peakcharge);
			return amount;


			}}


