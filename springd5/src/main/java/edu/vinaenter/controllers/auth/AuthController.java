package edu.vinaenter.controllers.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("admin")
public class AuthController {

	@GetMapping("login")
	public String login(@RequestParam(required = false) String msg, @RequestParam(required = false) String count) {
		System.out.println("Msg: " + msg);
		System.out.println("Count: " + count);
		return "jsp/views/football/login";
	}
	
}
