package com.example.prof;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class ProfController {
    

    @Autowired
	private ProfRepository profRepository;
  


    @GetMapping("/prof")
    public List<Prof> getAllProf() {
        return (List<Prof>)this.profRepository.findAll();
    }

    @GetMapping("/prof/{email}")
	public Prof getProfDetails(@PathVariable("email") String email){
		return this.profRepository.findByEmail(email);
	}

    
    @PostMapping("/prof")
    public Prof addNewProf(@RequestBody Prof prof) {
        return this.profRepository.save(prof);
    }
    
}

