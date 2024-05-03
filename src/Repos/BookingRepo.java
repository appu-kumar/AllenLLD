package Repos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Modals.Booking;

public class BookingRepo {

	  Set<Booking> bookings=new HashSet<>();
	  UserRepo userRepo=new UserRepo();
	  VaccinationCenterRepo vaccinationCenterRepo=new VaccinationCenterRepo();
	  
	  public String bookVaccine(Booking booking)
	  {
		  int id=(int)(Math.random()*100+1);
		  booking.setBookingId(id);
		  bookings.add(booking);
		  return "vaccine cneter booked";
		  
	  }
	  
	  public String cancelBooking(String centerId, String BookingId, String UserId)
	  {
		  if(bookings.contains(BookingId))
			    bookings.remove(BookingId);
		  userRepo.remove(UserId);
		  vaccinationCenterRepo.remove(centerId);
		  return "";
	  }
	  
	  
	  
}
