package tdd.main.validador;
import palidromo.src.tdd.main.validador.ValidadorPalidromo;

public class Main {
    public static void main(String[] args) {
        

        ValidadorPalidromo validador = new ValidadorPalidromo(validadorPalidromo -> {
            if (validadorPalidromo == null) {
                throw new IllegalArgumentException("Texto não pode ser nulo.");
            }
        });

        String palavra = "arara";
        boolean resultado = validador.ehPalindromo(palavra);
        System.out.println("Palavra: " + palavra);
        System.out.println("Resultado: " + resultado);
        System.out.printf("%s é palíndromo? %s\n", palavra, resultado ? "Sim" : "Não");
    }
}
