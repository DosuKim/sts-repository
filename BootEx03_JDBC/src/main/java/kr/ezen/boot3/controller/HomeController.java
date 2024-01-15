package kr.ezen.boot3.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.ezen.boot3.service.TestService;

@Configuration
@Controller
public class HomeController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("date1", new Date());
		model.addAttribute("date2", jdbcTemplate.queryForObject("select sysdate from dual", Date.class));
		model.addAttribute("date3", testService.getToday1());
		model.addAttribute("date4", testService.getToday2());
		model.addAttribute("vo1", testService.getTestVO1(11, 22));
		model.addAttribute("vo2", testService.getTestVO1(55, 21));
		
		return "index";
	}
}
