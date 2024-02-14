package com.blueyonder.Postgre;

import org.springframework.boot.SpringApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.blueyonder.Postgre.entity.Department;

@SpringBootApplication
public class PostgresqlApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
//	@Autowired
//	private DepartmentRepository departmentRepo;
//	
	public static void main(String[] args) {
		SpringApplication.run(PostgresqlApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		List<Department> departments=departmentRepo.findAll();
//		departments.forEach(System.out :: println);
//		System.exit(0);
//		
//	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String psql="Insert into department (depid,depname,deplocation) values (7,'Logistics','Lucknow')";
		int rows=jdbcTemplate.update(psql);
		if(rows>0) {
			System.out.println("New row inserted");
		}
	}

}
