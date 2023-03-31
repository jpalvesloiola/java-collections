package br.com.alura;

import java.util.*;

public class TesteAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        //1) adicione alguns alunos
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico"); 

        //2) imprima o tamanho da colecao
		System.out.println(alunos.size());
		

        //3) tente adicionar um aluno que existe
        System.out.println("Pedro foi adicionado? " + (alunos.add("Paulo") == true ? "Sim" : "Nao"));

        //4) imprima novamente o tamanho da colecao
        
        
    }
}