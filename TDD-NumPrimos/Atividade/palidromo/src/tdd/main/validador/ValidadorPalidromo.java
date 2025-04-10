import java.text.Normalizer;

public class ValidadorPalidromo {

    public ValidadorPalidromo() {
        ehPalindromo(null);
    }

    public boolean ehPalindromo(String texto) {
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        
        String textoReverso = new StringBuilder(textoNormalizado).reverse().toString();
        
        return textoNormalizado.equals(textoReverso);
    }
}