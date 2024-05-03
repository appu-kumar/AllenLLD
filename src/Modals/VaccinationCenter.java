package Modals;

public class VaccinationCenter {

	  private String currentState;
	  private String currentDistrict;
	  private String centerId;
	  
	  
	  
	public VaccinationCenter(String currentState, String currentDistrict, String centerId) {
		super();
		this.currentState = currentState;
		this.currentDistrict = currentDistrict;
		this.centerId = centerId;
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
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
}
