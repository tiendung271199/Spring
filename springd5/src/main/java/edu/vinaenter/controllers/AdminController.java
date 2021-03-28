package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {

	@GetMapping("login/{name}/check/{check}")
	public String login(@PathVariable String name, @PathVariable String check, RedirectAttributes ra) {
		System.out.println("Check: " + check);
		if (name.equals("public")) {
			ra.addFlashAttribute("msg", "Bạn cần đăng nhập vào hệ thống");
			return "redirect:/football/index";
		}
		return "redirect:/admin/login";
	}
	
}
