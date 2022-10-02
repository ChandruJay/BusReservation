package BusReserve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	private String name;
	private int BusNo;
	private Date date;
	
	public Booking() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name: ");
		name =sc.nextLine();
		System.out.println("Enter bus number: ");
		BusNo=sc.nextInt();
		System.out.println("Enter date in the format dd-MM-yyyy");
		String inpdate = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date=dateFormat.parse(inpdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBusNo() {
		return BusNo;
	}
	
	public void setBusNo(int busNo) {
		BusNo = busNo;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings , ArrayList<Bus> buses ) {
		int capacity=0,booked=0;
		for (Bus bus :buses) {
			if (bus.getBusNo()==BusNo) {
				capacity=bus.getSize();
				break;
			}
		}
		for(Booking books:bookings) {
			if (books.getBusNo()==BusNo && books.date.equals(date)) {
				booked++;
			}
		}
		System.out.println("Seats Available before your booking:"+""+(capacity-booked));
		return booked<capacity? true:false;

	}
	

}
