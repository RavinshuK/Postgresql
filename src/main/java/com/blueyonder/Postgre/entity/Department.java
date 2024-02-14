package com.blueyonder.Postgre.entity;

import org.springframework.aot.generate.GenerationContext;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer depid;
	private String depname;
	private String deplocation;
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", deplocation=" + deplocation + "]";
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public String getDeplocation() {
		return deplocation;
	}
	public void setDeplocation(String deplocation) {
		this.deplocation = deplocation;
	}
	
	
}
