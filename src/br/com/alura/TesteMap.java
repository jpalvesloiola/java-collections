package br.com.alura;

import java.util.*;
import java.util.Map.Entry;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        // ...
        Collection<Integer> values = nomesParaIdade.values();
        values.forEach(idade -> {
        	System.out.println(idade);
        });
        
        Collection<String> keys = nomesParaIdade.keySet();
        keys.forEach(nome -> {
        	System.out.println(nome);
        });
        
        Set<Entry<String, Integer>> associations = nomesParaIdade.entrySet();
		associations.forEach(association -> {
			System.out.println(association.getKey() + " - " + association.getValue());
		});
    }
}