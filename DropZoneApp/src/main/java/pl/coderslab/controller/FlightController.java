package pl.coderslab.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.coderslab.model.Flight;
import pl.coderslab.repository.AircraftRepository;
import pl.coderslab.repository.FlightRepository;

@Controller
@RequestMapping("/flights")
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private AircraftRepository aircraftRepository;
	//List
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String showFlights(Model model) {
		model.addAttribute("flight", flightRepository.findAll());
		return "flightList";
	}
	
	//Add
	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public String showAddFlight(Model model) {
		model.addAttribute("flight", new Flight());
		model.addAttribute("aircrafts", aircraftRepository.findAll());
		return "flightForm";
	}
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String processAddFlight(@Valid @ModelAttribute Flight flight, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "flightForm";
		}
		flightRepository.save(flight);
		return "redirect:/flights/list";
	}
}
