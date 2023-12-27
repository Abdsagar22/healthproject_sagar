package com.sagar.springboot_hospital_app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.springboot_hospital_app.Dto.MedItem;

public interface MedItemRepo extends JpaRepository<MedItem, Integer> {

}
