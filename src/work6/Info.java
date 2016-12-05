package work6;


public class Info {
	private String date1;
	private String date2;
    private int days;
    private int hours;
    private int second;
    private int mins;
    public void set(String date1,String date2,int days,int hours,int mins,int second){
    	this.date1=date1;
    	this.date2=date2;
    	this.days=days;
    	this.hours=hours;
    	this.second=second;
    	this.mins=mins;
    }
	public Info() {
		// TODO Auto-generated constructor stub
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}

}
