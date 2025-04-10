package atividade.tdd.palidromo.test;

import atividade.tdd.palidromo.validador.ValidadorPalidromo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPalidromoTest {
    @Test 
    public void testEhPalindromo() {
        ValidadorPalidromo validador = new ValidadorPalidromo();
        String palavra = "arara";
        boolean resultado = validador.ehPalindromo(palavra);
        assertTrue(resultado, "A palavra deve ser um palíndromo.");
    }

    @Test
    public void testNaoEhPalindromo() {
        ValidadorPalidromo validador = new ValidadorPalidromo();
        String palavra = "casa";
        boolean resultado = validador.ehPalindromo(palavra);
        assertFalse(resultado, "A palavra não deve ser um palíndromo.");
    }
}