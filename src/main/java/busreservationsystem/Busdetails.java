package busreservationsystem;

import java.time.LocalTime;

public class Busdetails {
	
	private String busid;
	private int busprice;
	private LocalTime strtdt,enddt;
	public Busdetails(String busid,  int busprice, LocalTime strtdt, LocalTime enddt) {
		super();
		this.busid = busid;
		
		this.busprice = busprice;
		this.strtdt = strtdt;
		this.enddt = enddt;
	}
	public String getBusid() {
		return busid;
	}
	public void setBusid(String busid) {
		this.busid = busid;
	}
	
	public int getBusprice() {
		return busprice;
	}
	public void setBusprice(int busprice) {
		this.busprice = busprice;
	}
	public LocalTime getStrtdt() {
		return strtdt;
	}
	public void setStrtdt(LocalTime strtdt) {
		this.strtdt = strtdt;
	}
	public LocalTime getEnddt() {
		return enddt;
	}
	public void setEnddt(LocalTime enddt) {
		this.enddt = enddt;
	}
	@Override
	public String toString() {
		return "Busdetails [busid=" + busid + ", busname=" + busname + ", drivernme=" + drivernme + ", busprice="
				+ busprice + ", strtdt=" + strtdt + ", enddt=" + enddt + "]";
	}
	
	
	
}
