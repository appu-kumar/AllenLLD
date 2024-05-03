package Modals;

public class Capacity {

	  private String centerId;
	  private Integer day;
	  private String userId;
	  
	  
	public Capacity(String centerId, Integer day, String userId) {
		super();
		this.centerId = centerId;
		this.day = day;
		this.userId = userId;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	  
	  
}
