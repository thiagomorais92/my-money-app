package com.example;

import java.util.ArrayList;
import java.util.List;

public class DebitsLoader {

	public static List<Debit> charge(int mes) {
		List<Debit> lista = new ArrayList<>(0);
		switch (mes) {
		case 1:
			lista.add(new Debit("IPTU",2500.00));
			lista.add(new Debit("IPVA",2000.00));
			lista.add(new Debit("IR",300.00));
			break;
		case 2:
			lista.add(new Debit("PS 4 ",1500.00));
			lista.add(new Debit("Banco de Couro",900.00));
			lista.add(new Debit("Multa",85.00));
			break;
		default:
			break;
		}
		return lista;
	}

}
