package BusReserve;

public class Bus {
	private int busNo;
	private boolean ac;
	private int size;
	
	public Bus(int busNo, boolean ac, int size) {
		this.busNo=busNo;
		this.ac=ac;
		this.size=size;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void displayInfo() {
		String s ="No";
		if (ac) {
			s="Yes";
		}

		System.out.println("Bus Number: " + busNo);
		System.out.println("Ac: " + s);
		System.out.println("Number of Seats: " + size);
		System.out.println(" ");
	}
	
	
	
}
