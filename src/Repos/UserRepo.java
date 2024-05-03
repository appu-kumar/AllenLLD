package Repos;

import java.util.ArrayList;
import java.util.List;

import Modals.User;

public class UserRepo {
   
	private List<User> userRepo=new ArrayList<>();
	public String add(User user)
	{
		userRepo.add(user);
		return "User added successfully";
	}
	
	public void remove(String userId)
	{
		 for(User user:userRepo)
		 {
			   if(user.getUserId().equals(userId))
			   {
				   userRepo.remove(user);
			       break;
			   }
		 }
	}
}
