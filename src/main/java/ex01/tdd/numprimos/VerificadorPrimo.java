/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.tdd.numprimos;

/**
 *
 * @author rafaelamoreira
 */
public class VerificadorPrimo {
     public static boolean ePrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Teste com 2 (esperado true): " + ePrimo(2));
        System.out.println("Teste com 10 (esperado false): " + ePrimo(10));
        System.out.println("Teste com 13 (esperado true): " + ePrimo(13));
        System.out.println("Teste com -5 (esperado false): " + ePrimo(-5));
    }
}
