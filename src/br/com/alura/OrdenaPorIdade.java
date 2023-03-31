package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario f1, Funcionario f2) {
		// TODO Auto-generated method stub
		return f1.getIdade() - f2.getIdade();
	}
	
}
