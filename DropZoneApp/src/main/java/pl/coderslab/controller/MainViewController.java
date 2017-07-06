package pl.coderslab.controller;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

@Controller
@RequestMapping("/")
public class MainViewController {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private final String TIME_ADD = " 00:00:00.0";
	//REGISTRATION
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		return "registerForm";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String registerUSer(@RequestParam String expiration, @ModelAttribute User user, Model model) {
		Timestamp ts = Timestamp.valueOf(expiration+TIME_ADD);
		user.setInsuranceExpirationDate(ts);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		model.addAttribute("user", user);
		return "redirect:/login";
	}
	//LOGIN
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		model.addAttribute("user", new User());
		return "loginForm";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute User user, Model model, HttpServletRequest request) {
		User userToCheck = userRepository.findByEmail(user.getEmail());
		if (userToCheck != null && passwordEncoder.matches(user.getPassword(), userToCheck.getPassword())) {
			request.getSession().setAttribute("userId", userToCheck.getId());
			return "mainAppView3";
		} else {
			request.getSession().removeAttribute("userId");
			request.setAttribute("invalid", "The username and password you entered did not match our records.");
			return "redirect:/login";
		}
	}
	//MAIN VIEW
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String isAuthenticated(HttpServletRequest request) {
		try {
			String userId = request.getSession().getAttribute("userId").toString();
			return "mainAppView3";
		} catch (Exception e) {
			return "redirect:/login";
		}
	}
	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("userId");
			return "logout";
	}
}
