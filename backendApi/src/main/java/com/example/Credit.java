package com.example;

import java.util.Random;

public class Credit {

	private Long id;
	
	private String name;
	
	private Double value;
	
	
	public Credit() {
		this.id = new Random().nextLong();
	}

	public Credit(String nome, double valor) {
		this.id = new Random().nextLong();
		this.name = nome;
		this.value = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
	
}
