package Repos;

import java.util.ArrayList;
import java.util.List;

import Modals.VaccinationCenter;

public class VaccinationCenterRepo {

	 List<VaccinationCenter> vaccinationCenterRepo=new ArrayList<>();
	 
	 public String add(VaccinationCenter vaccinationCenter)
	 {
		 this.vaccinationCenterRepo.add(vaccinationCenter);
		 return "Vaccination center is booked successfully";
		 
	 }
	 
	 public  List<VaccinationCenter>  getAllVaccinationCenters(String districtName)
	 {
		 List<VaccinationCenter> temp=new ArrayList<>();
		 
		 for(int i=0;i<vaccinationCenterRepo.size();i++)
		 {
			 if(vaccinationCenterRepo.get(i).getCurrentDistrict().equals(districtName))
				       temp.add(vaccinationCenterRepo.get(i));
		 }
		 
		 return temp;
	 }
	 
	 public void remove(String centerId)
	 {
		  for(VaccinationCenter vc:vaccinationCenterRepo)
		  {
			  if(vc.getCenterId().equals(centerId))
			  {
				  vaccinationCenterRepo.remove(vc);
				  break;
			  }
		  }
	 }
	
}
