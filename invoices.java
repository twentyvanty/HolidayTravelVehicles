package HolidayTravelVehicles;

import java.util.ArrayList;

public class invoices {
	
	private String invoiceID;
	private int negotiateprice;
	private String appplicabletax;
	private int licensefee;
	
	
	public String getcustomerinfo() {
		return invoiceID;
	}
	
    public int getvehicleinfo() {
		return negotiateprice;
	}
    
    public int gettradeinvehicleinfo() {
		return licensefee;
	}
    
    private salesperson sales;
    private payment_service payment;
    private vehicle v;
    
    private ArrayList<dealer> deal;
    private customer c;

}
