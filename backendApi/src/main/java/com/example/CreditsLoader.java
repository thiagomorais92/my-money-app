package com.example;

import java.util.ArrayList;
import java.util.List;

public class CreditsLoader {

	public static List<Credit> charge(int mes) {
		List<Credit> lista = new ArrayList<>(0);
		
		switch (mes) {
		case 1:
			lista.add(new Credit("Décimo Terceiro.",3000.00));
			lista.add(new Credit("Presente", 300.00));
		break;
			
		case 2:
			lista.add(new Credit("Primeiro Salario.",3000.00));
			lista.add(new Credit("FGTS contas inativas", 970.00));
		break;
		
		default:
			break;
		}
		
		
		return lista;
	}

	

}
