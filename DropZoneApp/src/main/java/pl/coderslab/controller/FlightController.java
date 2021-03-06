package pl.coderslab.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.model.Flight;
import pl.coderslab.model.User;
import pl.coderslab.repository.AircraftRepository;
import pl.coderslab.repository.FlightRepository;
import pl.coderslab.repository.UserRepository;
import pl.coderslab.service.FlightService;

@Controller
@RequestMapping("/flights")
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private AircraftRepository aircraftRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private FlightService flightService;

	//List
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String showFlights(Model model) {
		model.addAttribute("flight", flightRepository.findAll());
		model.addAttribute("jumpers", userRepository.findAll());
		return "flightList";
	}
	
	@RequestMapping(path = "/list", method = RequestMethod.POST)
	public String processShowFlight(@RequestParam String userId, @RequestParam String flightId) {
		User user = userRepository.findOne(Long.parseLong(userId));
		Flight flight = flightRepository.findOne(Long.parseLong(flightId));
		flight.addUser(user);
		flightRepository.save(flight);
		return "redirect:/flights/list";
	}
	
	//Add
	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public String showAddFlight(Model model) {
		model.addAttribute("flight", new Flight());
		model.addAttribute("aircrafts", aircraftRepository.findAll());
		return "flightForm";
	}
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String processAddFlight(@ModelAttribute Flight flight, BindingResult result) {
		if (result.hasErrors()) {
			return "flightForm";
		}
		flightRepository.save(flight);
		return "redirect:/flights/list";
	}
	
	// EDIT
		@RequestMapping(path = "/edit/{id}", method = RequestMethod.GET)
		public String editFlight(Model model, @PathVariable Long id) {
			model.addAttribute("flight", flightRepository.findOne(id));
			model.addAttribute("aircrafts", aircraftRepository.findAll());
			return "flightForm";
		}

		@RequestMapping(path = "/edit/{id}", method = RequestMethod.POST)
		public String processEditFlight(@ModelAttribute Flight flight, BindingResult result) {
			if (result.hasErrors()) {
				return "flightForm";
			}
			flightRepository.save(flight);
			return "redirect:/flights/list";
		}

		// DELETE
		@RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
		public String removeFlight(@PathVariable Long id, Model model) {
			model.addAttribute("object", flightRepository.findOne(id));
			return "confirmRemove";
		}

		@RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
		public String processRemoveFlight(@ModelAttribute Flight flight) {
			flightRepository.delete(flight);
			return "redirect:/flights/list";
		}
		
		// TIMER START
		@RequestMapping(path = "/start/{id}", method = RequestMethod.GET)
		public String timerStart(@PathVariable Long id) {
			Flight flight = flightRepository.findOne(id);
			flight.start();
			flightRepository.save(flight);
			return "redirect:/flights/list";
		}
		
		// TIMER STOP
		@RequestMapping(path = "/stop/{id}", method = RequestMethod.GET)
		public String timerStop(@PathVariable Long id) {
			Flight flight = flightRepository.findOne(id);
			flightService.finishFlight(flight);
			flightRepository.save(flight);
			return "redirect:/flights/list";
		}
}
