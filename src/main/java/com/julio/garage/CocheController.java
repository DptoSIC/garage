package com.julio.garage;

import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CocheController {
	@Autowired
	CocheDAO repo;

	@RequestMapping("addcoche/")
	   public String AddCoche(Coche coche) 
	   {
		   repo.save(coche);
		   return "index";
	   }	
	
	
}
