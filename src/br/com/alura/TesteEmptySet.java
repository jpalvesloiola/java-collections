package br.com.alura;
import java.util.*;

public class TesteEmptySet {

    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        
        nomes.add("Paulo"); //o que acontece aqui?
        
        nomes = Collections.emptySet();
        
        System.out.println(nomes);
        
        nomes.add("Joao");
    }

}