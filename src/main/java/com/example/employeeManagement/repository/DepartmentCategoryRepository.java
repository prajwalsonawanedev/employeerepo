package com.example.employeeManagement.repository;

import com.example.employeeManagement.entity.DepartmentCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentCategoryRepository extends JpaRepository<DepartmentCategory, Integer> {
}
