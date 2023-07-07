package com.example.prof;

import org.springframework.data.repository.CrudRepository;



public interface ProfRepository extends CrudRepository<Prof, Integer> {
 
    public Prof findByEmail(String email);
}
