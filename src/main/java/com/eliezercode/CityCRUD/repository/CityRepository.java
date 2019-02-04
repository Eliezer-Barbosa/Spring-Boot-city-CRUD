package com.eliezercode.CityCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezercode.CityCRUD.model.City;

public interface CityRepository extends JpaRepository<City, Long>{

}

