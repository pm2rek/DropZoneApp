package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	//List
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String showUsers(Model model) {
		model.addAttribute("user", userRepository.findAll());
		return "userList";
	}
	
	// EDIT
	@RequestMapping(path = "/edit/{id}", method = RequestMethod.GET)
	public String editUser(Model model, @PathVariable Long id) {
		model.addAttribute("user", userRepository.findOne(id));
		model.addAttribute("path", "/users");
		return "editForm";
	}

	@RequestMapping(path = "/edit/{id}", method = RequestMethod.POST)
	public String processEditUser(@ModelAttribute User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "editForm";
		}
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		return "redirect:/users/list";
	}

	// DELETE
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
	public String removeUser(@PathVariable Long id, Model model) {
		model.addAttribute("object", userRepository.findOne(id));
		return "confirmRemove";
	}

	@RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
	public String processRemoveUser(@ModelAttribute User user) {
		userRepository.delete(user);
		return "redirect:/users/list";
	}
	
	// PAYMENT
		@RequestMapping(path = "/payment/{id}", method = RequestMethod.GET)
		public String addPayment(Model model, @PathVariable Long id) {
			model.addAttribute("user", userRepository.findOne(id));
			return "paymentForm";
		}

		@RequestMapping(path = "/payment/{id}", method = RequestMethod.POST)
		public String processPayment(@PathVariable Long id, @RequestParam String value) {
			User user = userRepository.findOne(id);
			user.payment(value);
			System.out.println(user.getAccountBalance());
			userRepository.save(user);
			return "redirect:/users/list";
		}
}
