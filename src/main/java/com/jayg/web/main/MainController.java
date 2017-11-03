package com.jayg.web.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping("/main")
	public String main() {
		return "main/main";
	}
	
	@RequestMapping(value = "/views/{menu}/{page}", method = RequestMethod.GET)
	public String getViews(@PathVariable String menu, @PathVariable String page) {
		String forward = menu + "/" + page;
		return forward;
	}
	
	@RequestMapping(value = "/views/{menu}/{sub}/{page}", method = RequestMethod.GET)
	public String getViews(@PathVariable String menu, @PathVariable String sub, @PathVariable String page) {
		String forward = menu + "/" + sub + "/" + page;
		return forward;
	}
	
}
