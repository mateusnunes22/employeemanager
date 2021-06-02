package tech.getarrays.employeemanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	
	private String name;
	
	private String email;
	
	private String jobTitle;
	
	private String phone;
	
	private String imageURL;
	
	@Column(nullable = false, updatable = false)
	private String employeeCode;
}
