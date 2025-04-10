package atividade.palidromo.src.tdd.main.test;


import atividade.tdd.palidromo.src.main.ValidadorPalindromo;
import atividade.tdd.palidromo.src.main.validador.Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import java.text.Normalizer;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPalidromoTest {
    @Test 
    public void testEhPalindromo() {
        String palavra = "arara";
        boolean resultado = ValidadorPalindromo.ehPalindromo(palavra);
        assertTrue(resultado, "A palavra deve ser um palíndromo.");
    }
}

