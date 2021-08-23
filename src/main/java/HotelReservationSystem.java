import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
	static List<Integer> days = new ArrayList<Integer>();
	static List<Hotel> hotelList = new ArrayList<Hotel>();
	static int customertype;
	static Hotel hotel1 = new Hotel("Lakewood", 110, 80, 90, 80, 3);
	static Hotel hotel2 = new Hotel("Bridgewood", 160, 110, 60, 50, 4);
	static Hotel hotel3 = new Hotel("Ridgewood", 220, 100, 150, 40, 5);

	public static void main(String[] args) {
		System.out.println("\n\tWelcome to Hotel Reservation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Regular Customer\nEnter 2 for Rewarded Customer:");
		customertype=sc.nextInt();
		System.out.println("Enter Range of Dates---\n");
		addDate();
		addHotels();
		searchHotel();
		
	}

	public static void addHotels() {
		hotelList.add(hotel1);
		hotelList.add(hotel2);
		hotelList.add(hotel3);
	}

	public static void addDate() {
		Scanner sc = new Scanner(System.in);
		int flag1 = 1;
		while (flag1 == 1) {
			Calendar c = Calendar.getInstance();
			System.out.println("Enter Date(dd/mm/yyyy) : ");
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			try {
				Date date = format.parse(sc.next());
				c.setTime(date);
				Integer dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
				System.out.println(dayOfWeek);	
				days.add(dayOfWeek);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Want to add more date?\n Enter 1 for Yes or 2 for No!: ");
			flag1 = sc.nextInt();
		}
	}

	public static void searchHotel() {
		int lowestRate = Integer.MAX_VALUE;
		String hotelName= null;
		for (int i = 0; i < days.size(); i++) {
			if (days.get(i) == 1 || days.get(i) == 7) {
				if (customertype == 1) {
					for (int j = 0; j < hotelList.size(); j++) {
						if (lowestRate > hotelList.get(j).getWeekendRegularRate()) {
							lowestRate = hotelList.get(j).getWeekendRegularRate();
							hotelName = hotelList.get(j).getName();
						}
					}
				} else {
					for (int j = 0; j < hotelList.size(); j++) {
						if (lowestRate > hotelList.get(j).getWeekendRewardedRate()) {
							lowestRate = hotelList.get(j).getWeekendRewardedRate();
							hotelName = hotelList.get(j).getName();
						}
					}
				}
			} else {
				if (customertype == 1) {
					for (int j = 0; j < hotelList.size(); j++) {
						if (lowestRate > hotelList.get(j).getWeekdayRegularRate()) {
							lowestRate = hotelList.get(j).getWeekdayRegularRate();
							hotelName = hotelList.get(j).getName();
						}
					}
				} else {
					for (int j = 0; j < hotelList.size(); j++) {
						System.out.println("+");
						if (lowestRate > hotelList.get(j).getWeekdayRewardedRate()) {
							lowestRate = hotelList.get(j).getWeekdayRewardedRate();
							hotelName = hotelList.get(j).getName();
						}
					}
				}
			}
		}
		
		System.out.println("Hotel: "+hotelName +"\t Price: " +lowestRate);
	}

}
