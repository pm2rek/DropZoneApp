package pl.coderslab.controller;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.model.Parachute;
import pl.coderslab.repository.ParachuteRepository;
import pl.coderslab.repository.UserRepository;

@Controller
@RequestMapping("/parachutes")
public class ParachuteController {

	@Autowired
	private ParachuteRepository parachuteRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	private final String TIME_ADD = " 00:00:00.0"; 
	// List
		@RequestMapping(path = "/list", method = RequestMethod.GET)
		public String showParachutes(Model model) {
			model.addAttribute("parachute", parachuteRepository.findAll());
			return "parachuteList";
		}

		// Add
		@RequestMapping(path = "/add", method = RequestMethod.GET)
		public String showAddParachute(Model model) {
			model.addAttribute("parachute", new Parachute());
			model.addAttribute("users", userRepository.findAll());
			return "parachuteForm";
		}

		@RequestMapping(path = "/add", method = RequestMethod.POST)
		public String processAddParachute(@RequestParam String expiration, @ModelAttribute Parachute parachute,BindingResult result, Model model) {
			Timestamp ts = Timestamp.valueOf(expiration+TIME_ADD);
			parachute.setExpirationDate(ts);
			//			if (result.hasErrors()) {
//				return "parachuteForm";
//			}
			parachuteRepository.save(parachute);
			return "redirect:/parachutes/list";
		}
}
