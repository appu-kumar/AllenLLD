package Repos;

import java.util.ArrayList;
import java.util.List;

import Modals.Capacity;

public class CapacityRepo {

	List<Capacity> capacityRepo=new ArrayList<>();
	
	public String add(Capacity capacity)
	{
		capacityRepo.add(capacity);
		
		return "Capacity added successfully";
	}
	
	 
}
