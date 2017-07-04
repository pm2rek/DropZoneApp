package pl.coderslab.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.model.Aircraft;
import pl.coderslab.repository.AircraftRepository;

@Controller
@RequestMapping("/aircrafts")
public class AircraftController {

	@Autowired
	private AircraftRepository aircraftRepository;

	// List
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String showAircrafts(Model model) {
		model.addAttribute("aircraft", aircraftRepository.findAll());
		return "aircraftList";
	}

	// Add
	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public String showAddAircraft(Model model) {
		model.addAttribute("aircraft", new Aircraft());
		return "aircraftForm";
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String processAddAircraft(@RequestParam int maxPassengers, @ModelAttribute Aircraft aircraft, BindingResult result, Model model) {
		aircraft.setMaxPassengers(maxPassengers);
		if (result.hasErrors()) {
			return "aircraftForm";
		}
		aircraftRepository.save(aircraft);
		return "redirect:/aircrafts/list";
	}
}
