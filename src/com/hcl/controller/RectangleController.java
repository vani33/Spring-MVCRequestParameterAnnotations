package com.hcl.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.model.Rectangle;

@Controller
public class RectangleController {

	@RequestMapping("/rectangle")
	public String f1(@RequestParam("length") double length, 
					 @RequestParam("breadth") double breadth,
					  Model m){
						  Rectangle rectangle = new Rectangle(length, breadth);
						  double area = rectangle.calculateArea();
						  m.addAttribute("area", area);
						  return "success";
					  }
}
		