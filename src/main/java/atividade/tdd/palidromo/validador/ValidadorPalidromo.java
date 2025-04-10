package atividade.tdd.palidromo.validador;

import java.text.Normalizer;

public class ValidadorPalidromo {
    public boolean ehPalindromo(String texto) {
        if (texto == null || texto.isBlank()) {
            throw new IllegalArgumentException("Texto não pode ser nulo ou vazio.");
        }

        // Normaliza o texto removendo acentuação e caracteres especiais
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        String textoReverso = new StringBuilder(textoNormalizado).reverse().toString();
        
        return textoNormalizado.equals(textoReverso);
    }

    public ValidadorPalidromo() {
        // Default constructor
    }

    public ValidadorPalidromo(Object object) {
        //TODO Auto-generated constructor stub
    }
}