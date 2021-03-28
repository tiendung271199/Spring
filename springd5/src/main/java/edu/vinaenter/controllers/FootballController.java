package edu.vinaenter.controllers;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.model.Football;
import edu.vinaenter.service.FootballService;

@Controller
@RequestMapping("football")
public class FootballController {

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private FootballService footballService;
	
	private static final Logger logger = LoggerFactory.getLogger(FootballController.class);

	@GetMapping("index")
	public String index(Model model) {
		logger.info("Call method index()");
		// add try catch
		List<Football> footballList = footballService.getList();
		model.addAttribute("footballList", footballList);
		return "jsp/views/football/index";
	}

	@GetMapping("add")
	public String add() {
		return "jsp/views/football/add";
	}

	@PostMapping("add")
	public String add(@RequestParam String name, @RequestParam String createDate, Model model) {
		System.out.println("Name: " + name);
		System.out.println("Date: " + createDate);
		return "jsp/views/football/add";
	}

	@PostMapping("add/model")
	public String add(@Valid @ModelAttribute("fb") Football football, BindingResult rs, RedirectAttributes ra) {
		if (rs.hasErrors()) {
			System.out.println("Error data");
			return "jsp/views/football/add";
		}
		/*
		 * String fileName = FileUtil.uploadFile(football.getPicture());
		 * System.out.println(fileName);
		 */
		int save = footballService.save(football);
		if (save > 0) {
			ra.addFlashAttribute("msgSuccess", messageSource.getMessage("msgSuccess", null, Locale.getDefault()));
			return "redirect:/football/index";
		}
		return "jsp/views/football/add";
	}

	@GetMapping("login")
	public String login() {
		return "jsp/views/football/login";
	}

	@GetMapping("detail/{id}")
	public String detail(@PathVariable int id, Model model) {
		Football football = footballService.getFootball(id);
		model.addAttribute("football", football);
		return "jsp/views/football/detail";
	}

}
