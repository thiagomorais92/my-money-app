package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BillingCyclesLoader {

	static List<BillingCycle> lista = new ArrayList<>(0);

	public static List<BillingCycle> getDefaults() {
		
		if(lista.size() ==0) {
			List<Credit> creditos = CreditsLoader.charge(1);
			List<Debit>  debitos  = DebitsLoader.charge(1);
			lista.add(new BillingCycle("Janeiro/2017",1,2017,creditos, debitos));
			
			List<Credit> creditos2 = CreditsLoader.charge(2);
			List<Debit>  debitos2  = DebitsLoader.charge(2);
			lista.add(new BillingCycle("Fevereiro/2017",2,2017,creditos2, debitos2));
		}
		return lista;
	}

	public static BillingCycle findSpecifidBilling(long billingId) {
		BillingCycle billingFound = null;
		
		List<BillingCycle> lista = getDefaults();
		for (BillingCycle billingCycle : lista) {
			if(billingCycle.getId() == billingId) {
				billingFound = billingCycle;
			}
		}
		
		return billingFound;
	}

	public static Summary getSummary() {
		Double resultadoCredito = 0.0;
		Double resultadoDebito = 0.0;
		
		List<BillingCycle> allCycles = getDefaults();
			
		for (BillingCycle billingCycle : allCycles) {
				resultadoCredito = (resultadoCredito + getSomaCredits(billingCycle.getCredits()));
				resultadoDebito  = (resultadoDebito  + getSomaDebits(billingCycle.getDebits()));
		}
		
		return new Summary(resultadoCredito,resultadoDebito);
		
	}

	private static Double getSomaDebits(List<Debit> debits) {
		Double res = 0.0;
		for (Debit debit : debits) {
			res = (res + debit.getValue());
		}
		return res;
	}

	private static Double getSomaCredits(List<Credit> credits) {
		double res = 0.0;
		for (Credit credit : credits) {
			res = (res+credit.getValue());
		}
		return res;
	}

	public static void deleteSpecifidBilling(long billingId) {
		for (Iterator<BillingCycle> iterator =  lista.iterator();iterator.hasNext();){
			BillingCycle billing = iterator.next();
			if(billing.getId() == billingId) {
				iterator.remove();
			}
		}
		
	}

}
