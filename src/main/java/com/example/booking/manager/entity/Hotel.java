package com.example.booking.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "hotel")
@Data
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	@Column
	private String name;
	@Column
	private String address;
}
