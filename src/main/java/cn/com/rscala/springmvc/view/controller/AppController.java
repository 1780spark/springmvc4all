package cn.com.rscala.springmvc.view.controller;

import cn.com.rscala.springmvc.view.model.Wine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value="/rscala/{name}", method = RequestMethod.GET)
	public String getWine(@PathVariable String name, ModelMap model) {
 
		Wine wine = new Wine(name);
		model.addAttribute("name", wine);
 
		return "wine";
 
	}
	
}
