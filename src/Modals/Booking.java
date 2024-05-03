package Modals;

public class Booking {

	 private int bookingId;
	private String centerId;
	 private int day;
	 private String UserId;
	 
	 
	 public Booking(int bookingId, String centerId, int day, String userId) {
		super();
		this.bookingId = bookingId;
		this.centerId = centerId;
		this.day = day;
		UserId = userId;
	}
	public int getBookingId() {
			return bookingId;
		}
		public void setBookingId(int id) {
			this.bookingId = id;
		} 
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	 
	 
	  
}
