package com.bloomreach.ClassifyPerson.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassifyPersonController {
	
	
	@GetMapping("/getPerson/{age}/{gender}")
	public String classifyPerson(@PathVariable int age, @PathVariable String gender) {
	//gender can't be boolean so converting it into String or char
		
	
		String result = null;
		if(gender.equalsIgnoreCase("Male"))
		{
		if(age>=18)
		result="MAN";
		else
			
			result="BOY";
	
		}
		if (gender.equalsIgnoreCase("Female"))
		{
			if(age>=18)
				result="WOMAN";
		else
		result="GIRL";
		}
		return result;

}
}
