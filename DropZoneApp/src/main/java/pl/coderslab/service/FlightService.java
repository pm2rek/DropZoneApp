package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.coderslab.model.Flight;
import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

@Service
public class FlightService {

	@Autowired
	private UserRepository userRepository;

	public void finishFlight(Flight flight) {
		if (flight.getTakeoff() != null) {
			flight.stop();
			for (User user : flight.getUsers()) {
				user.increaseJumpsNumber();
				user.subtract(flight.getAircraft().getTicketPrice());
				userRepository.save(user);
			}
		}
	}
}
