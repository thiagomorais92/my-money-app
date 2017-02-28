package com.example;

import java.util.List;
import java.util.Random;

public class BillingCycle {

	private Long id;
	
	private String name;
	
	private Integer month;
	
	private Integer year;

	private List<Credit> credits;

	private List<Debit> debits;
	
	
	public BillingCycle() {
		this.id = new Random().nextLong();
	}

	public BillingCycle(String nome, int mes, int ano, List<Credit> creditos, List<Debit> debitos) {
		this.id = new Random().nextLong();
		this.name = nome;
		this.month = mes;
		this.year = ano;
		this.credits = creditos;
		this.debits = debitos;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Credit> getCredits() {
		return credits;
	}

	public void setCredits(List<Credit> credits) {
		this.credits = credits;
	}

	public List<Debit> getDebits() {
		return debits;
	}

	public void setDebits(List<Debit> debits) {
		this.debits = debits;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public int getmonth() {
		return month;
	}

	public void setmonth(Integer month) {
		this.month = month;
	}

	public int getyear() {
		return year;
	}

	public void setyear(Integer year) {
		this.year = year;
	}
	
	
}
