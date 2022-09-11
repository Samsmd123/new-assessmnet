package com.example.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Department;
import com.example.model.Walmart;
@Repository
public interface IDepartmentRepository extends JpaRepository<Department,Integer> {
}
