package com.training.employeespringsoap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.employeespringsoap.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
