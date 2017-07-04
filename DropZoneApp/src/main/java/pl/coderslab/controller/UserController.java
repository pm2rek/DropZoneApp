package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.coderslab.repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	//List
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String showUsers(Model model) {
		model.addAttribute("user", userRepository.findAll());
		return "userList";
	}
	
	
}
