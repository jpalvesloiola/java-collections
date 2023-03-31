package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestaPerformance {

    public static void main(String[] args) {

//    	Collection<Integer> numeros = new ArrayList<Integer>();
//    	Collection<Integer> numeros = new LinkedList<Integer>();
    	Collection<Integer> numeros = new HashSet<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto adicionando: " + tempoDeExecucao);
        
        inicio = System.currentTimeMillis();
       
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        fim = System.currentTimeMillis();

        tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto buscando: " + tempoDeExecucao);

    }

}
