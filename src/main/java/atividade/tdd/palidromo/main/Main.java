package atividade.tdd.palidromo.main;

import atividade.tdd.palidromo.validador.ValidadorPalidromo;

public class Main {
    public static void main(String[] args) {
        
        ValidadorPalidromo validador = new ValidadorPalidromo();

        String palavra = "arara";
        boolean resultado = validador.ehPalindromo(palavra);

        System.out.println("Palavra: " + palavra);
        System.out.println("Resultado: " + resultado);
        System.out.printf("%s é palíndromo? %s\n", palavra, resultado ? "Sim" : "Não");
    }
}