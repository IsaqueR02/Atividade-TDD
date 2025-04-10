package atividade.palidromo.src.tdd.main.test;


import atividade.tdd.palidromo.src.main.ValidadorPalindromo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import java.text.Normalizer;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPalidromoTest {
    @Test 
    public void testPalavraSimples() {
        assertTrue(ValidadorPalindromo.ehPalindromo("ana"));
        assertTrue(ValidadorPalindromo.ehPalindromo("ovo")); 
        assertFalse(ValidadorPalindromo.ehPalindromo("casa"));
    }

    @Test 
    public void testFrase() { 
        assertTrue(ValidadorPalindromo.ehPalindromo("Ame a ema")); 
        assertTrue(ValidadorPalindromo.ehPalindromo("Socorram-me subi no ônibus em Marrocos"));
        assertFalse(ValidadorPalindromo.ehPalindromo("Esta frase não é um palíndromo"));
    } 
    
    @Test 
    public void testIgnorarMaiusculasMinusculas() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Able was I ere I saw Elba"));
    }
    
    @Test public void testIgnorarEspacos() {
        assertTrue(ValidadorPalindromo.ehPalindromo("never odd or even"));

    } 
    @Test public void testIgnorarPontuacao() {
        assertTrue(ValidadorPalindromo.ehPalindromo("A man, a plan, a canal: Panama"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A Santa at NASA"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Madam, in Eden, I'm Adam"));
    } 
    @Test 
    public void testIgnorarAcentos() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Á vida é a diva!"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A mala nada na lama"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A torre da derrota"));
    }
    @Test
    public void testEspacosEAcentos() {
        assertTrue(ValidadorPalindromo.ehPalindromo("A mala nada na lama"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A torre da derrota"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Á vida é a diva!"));
    }
    @Test
    public void testEspacosEAcentosComFrases() {
        assertTrue(ValidadorPalindromo.ehPalindromo("A mala nada na lama"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A torre da derrota"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Á vida é a diva!"));
    }
    @Test
    public void testEspacosEAcentosComFrasesComPontuacao() {
        assertTrue(ValidadorPalindromo.ehPalindromo("A mala nada na lama"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A torre da derrota"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Á vida é a diva!"));
    }
    @Test
    public void testEspacosEAcentosComFrasesComPontuacaoComMaiusculas() {
        assertTrue(ValidadorPalindromo.ehPalindromo("A mala nada na lama"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A torre da derrota"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Á vida é a diva!"));
    }
}

