package Modals;

public class User {

	  private String userId;
	  private String name;
	  private String gender;
	  private String currentState;
	  private String currentDistrict;
	  
	  
	public User(String userId, String name, String gender, String currentState, String currentDistrict) {
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.currentState = currentState;
		this.currentDistrict = currentDistrict;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public String getCurrentDistrict() {
		return currentDistrict;
	}
	public void setCurrentDistrict(String currentDistrict) {
		this.currentDistrict = currentDistrict;
	}
}
