package com.sagar.springboot_hospital_app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.springboot_hospital_app.Dto.Encounter;

public interface EncounterRepo extends JpaRepository<Encounter, Integer> {

}
