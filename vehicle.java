package HolidayTravelVehicles;

public class vehicle {
	private int vehiclenum;
	private String name;
	private String model;
	private int year;
	private String manufacturer;
	private int basecost;
	
	public vehicle (String name, String model, int year, String manufacturer,int num) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.vehiclenum = num;
	}
	
	public String getvehicleinfo() {
		return this.name + " " + this.model + " " + this.year + " " + this.manufacturer + " " + this.vehiclenum;
	}
	
	private mechanical Mechanical;
	private invoices invoice;
}
