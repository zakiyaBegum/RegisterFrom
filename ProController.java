package com.example.test;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProController {
	
	@Autowired
	ProService serv;
	
	@RequestMapping("/")
	String index() {
		return "form";
	}
	
	@PostMapping("/addData")
	String addData(@ModelAttribute DataClass dc) {
		serv.addData(dc);
		return "redirect:/";
	}
	
	@PostMapping("/getData")
	String getData(@ModelAttribute DataClass dc, Model model){
		DataClass dc1 = serv.getData(dc.getFormNo());
		
		model.addAttribute("formno", dc1.getFormNo());
		model.addAttribute("date", dc1.getDate());
		model.addAttribute("name", dc1.getName());
		model.addAttribute("regno", dc1.getRegNo());
		model.addAttribute("whatno", dc1.getWhatNo());
		model.addAttribute("emailid", dc1.getEmailId());
		model.addAttribute("course", dc1.getCourse());
		model.addAttribute("trainer", dc1.getTrainer());
		return "form";
	}
	
	@PostMapping("/updateData")
	String updateData(@ModelAttribute DataClass dc) {
		serv.updateData(dc);
		return "redirect:/";
	}
	
	@PostMapping("/deleteData")
	String deleteData(@ModelAttribute DataClass dc) {
		serv.deleteData(dc.getFormNo());
		
		return "redirect:/";
	}
	
}
