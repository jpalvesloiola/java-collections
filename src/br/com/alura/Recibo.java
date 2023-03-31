package br.com.alura;

import java.util.Comparator;
import java.util.TreeSet;

public class Recibo implements Comparable<Recibo>{

	public static void main(String[] args) {

		Recibo rec1 = new Recibo();
// 		atribui valores
		Recibo rec2 = new Recibo();
// 		atribui valores
		Recibo rec3 = new Recibo();
// 		atribui valores
		
		TreeSet<Recibo> recibos = new TreeSet<>();
		
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);
	}

	@Override
	public int compareTo(Recibo o) {
		// TODO Auto-generated method stub
		return 0;
	}
}