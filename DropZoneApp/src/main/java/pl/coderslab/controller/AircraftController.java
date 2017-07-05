package pl.coderslab.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String processAddAircraft(@RequestParam int maxPassengers, @RequestParam int ticketPrice, @ModelAttribute Aircraft aircraft,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "aircraftForm";
		}
		aircraft.setTicketPrice(new BigDecimal(ticketPrice));
		aircraft.setMaxPassengers(maxPassengers);
		aircraftRepository.save(aircraft);
		return "redirect:/aircrafts/list";
	}

	// EDIT
	@RequestMapping(path = "/edit/{id}", method = RequestMethod.GET)
	public String editAircraft(Model model, @PathVariable Long id) {
		model.addAttribute("aircraft", aircraftRepository.findOne(id));
		return "aircraftForm";
	}

	@RequestMapping(path = "/edit/{id}", method = RequestMethod.POST)
	public String processEditAircraft(@ModelAttribute Aircraft aircraft, BindingResult result) {
		if (result.hasErrors()) {
			return "aircraftForm";
		}
		aircraftRepository.save(aircraft);
		return "redirect:/aircrafts/list";
	}

	// DELETE
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
	public String removeAircraft(@PathVariable Long id, Model model) {
		model.addAttribute("object", aircraftRepository.findOne(id));
		return "confirmRemove";
	}

	@RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
	public String processRemoveAircraft(@ModelAttribute Aircraft aircraft) {
		aircraftRepository.delete(aircraft);
		return "redirect:/aircrafts/list";
	}
}
