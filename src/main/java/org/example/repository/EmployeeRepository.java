package org.example.repository;

import org.example.model.EmployeeModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
}
