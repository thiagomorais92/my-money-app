package com.example;

public class Summary {

	private Double resultadoCredito;
	private Double resultadoDebito;

	public Summary(Double resultadoCredito, Double resultadoDebito) {
		this.resultadoCredito = resultadoCredito;
		this.resultadoDebito = resultadoDebito;
		
	}

	public Double getResultadoCredito() {
		return resultadoCredito;
	}

	public void setResultadoCredito(Double resultadoCredito) {
		this.resultadoCredito = resultadoCredito;
	}

	public Double getResultadoDebito() {
		return resultadoDebito;
	}

	public void setResultadoDebito(Double resultadoDebito) {
		this.resultadoDebito = resultadoDebito;
	}
	
	

}
