package com.julio.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class CocheController {
//	@Autowired
//	CocheDAO repo;
//
//	@GetMapping("/coches")
//	   public List<Coche> getCoches() 
//	   {
//		List<Coche> coches = (List<Coche>) repo.findAll();
//		return coches;
//		
//	   }
//	
//	@RequestMapping("coches/{id}")
//		public Optional<Coche> getCoche(@PathVariable int id) {
//		return repo.findById(id);
//	}
//	
//	@RequestMapping(method= RequestMethod.POST, value="/coches")
//		public void addCoche(@RequestBody Coche coche) {
//		repo.save(coche);
//}
////	@PostMapping("addcoche")
////	   public String AddCoche(Coche coche) 
////	   {
////		   repo.save(coche);
////		   return "index";
////	   }	
//	
	
//}
