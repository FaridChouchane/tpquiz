package com.tpquiz.tpquiz.entity;

import jakarta.persistence.Id;
//import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "countries")
public class Countrie {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@SequenceGenerator(name = "countries_seq", sequenceName = "countries_seq")
	public Integer id;

	public String name;

	public String capital;
}