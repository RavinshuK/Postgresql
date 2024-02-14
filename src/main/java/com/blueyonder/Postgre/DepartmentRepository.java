package com.blueyonder.Postgre;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blueyonder.Postgre.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
