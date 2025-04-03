/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import ex01.tdd.numprimos.VerificadorPrimo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rafaelamoreira
 */
public class VerificadorPrimoTest {
    @Test
    void deveRetornarFalseParaZero() {
        assertFalse(VerificadorPrimo.ePrimo(0));
    }

    @Test
    void deveRetornarFalseParaUm() {
        assertFalse(VerificadorPrimo.ePrimo(1));
    }

    @Test
    void deveRetornarTrueParaDois() {
        assertTrue(VerificadorPrimo.ePrimo(2));
    }

    @Test
    void deveRetornarTrueParaTreze() {
        assertTrue(VerificadorPrimo.ePrimo(13));
    }

    @Test
    void deveRetornarFalseParaVinte() {
        assertFalse(VerificadorPrimo.ePrimo(20));
    }

    @Test
    void deveRetornarFalseParaNumeroNegativo() {
        assertFalse(VerificadorPrimo.ePrimo(-5));
    }

    @Test
    void deveRetornarTrueParaNumeroPrimoGrande() {
        assertTrue(VerificadorPrimo.ePrimo(7919)); // 7919 is a prime number
    }

    @Test
    void deveRetornarFalseParaNumeroCompostoGrande() {
        assertFalse(VerificadorPrimo.ePrimo(8000)); // 8000 is not a prime number
    }

    @Test
    void deveRetornarTrueParaNumeroPrimoPequeno() {
        assertTrue(VerificadorPrimo.ePrimo(3)); // 3 is a prime number
    }

    @Test
    void deveRetornarFalseParaNumeroParMaiorQueDois() {
        assertFalse(VerificadorPrimo.ePrimo(10)); // 10 is not a prime number
    }
}
