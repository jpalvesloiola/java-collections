package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ImprimindoAlunosSemAcentos {
	 public static void main(String[] args) {

	        Collection<String> alunos = new HashSet<>();
	        alunos.add("Paulo");
	        alunos.add("Alberto");
	        alunos.add("Pedro");    
	        alunos.add("Nico"); 
	        
	        List<String> alunosArrayList = new ArrayList<>(alunos);
	        
	        System.out.println(alunosArrayList.get(0));

	       //tente imprimir os alunos usando foreach
	        for (String aluno : alunos) {
				System.out.println(aluno);
			}
	    }
}
