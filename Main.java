package BusReserve;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<>(); 
		ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1, false, 2));
		buses.add(new Bus(2, true, 3));
		buses.add(new Bus(3, true, 4));
		
		for (Bus b : buses) {
			b.displayInfo();
		}
		
		Scanner sc = new Scanner(System.in);
		int a = 1; 
		while (a==1) {
			
			System.out.println("Enter 1 to book and 2 to exit ");
			a=sc.nextInt();
			System.out.println(" ");
				
			if (a==1) {
			System.out.println("Starting booking process....");
			Booking booking = new Booking();
			if(booking.isAvailable(bookings, buses)){
				bookings.add(booking);
				System.out.println("Congratualtions! Your ticket is booked :) ");
			}
			else {
				System.out.println("Sorry! Bus is currently full. Try an other bus :(");
			}
			}
			System.out.println("");
			
		}
		
		sc.close();
	}

	
}
