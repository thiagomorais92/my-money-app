package com.example;

import java.util.Random;

public class Debit {

	private Long id;
	
	private String name;
	
	private Double value;
	
	private StatusEnum status;
	
	

	public Debit() {
		this.id = new Random().nextLong();
	}
	public Debit(String nome, Double valor,StatusEnum status) {
		this.id = (long) new Random().nextInt(600);
		this.name = nome;
		this.value = valor;
		this.status = status;
		
	}
	public Debit(String nome, Double valor) {
		this.id = (long) new Random().nextInt(600);
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

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
	
	
}
