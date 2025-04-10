import java.text.Normalizer;

public class ValidadorPalidromo {
    public static boolean ehPalindromo(String texto) {
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        
        String textoReverso = new StringBuilder(textoNormalizado).reverse().toString();
        
        return textoNormalizado.equals(textoReverso);
    }
    public static void main(String[] args) {
        System.out.println(ehPalindromo("A mala nada na lama")); 
        System.out.println(ehPalindromo("A torre da derrota"));
        System.out.println(ehPalindromo("Á vida é a diva!")); 
        System.out.println(ehPalindromo("Ame a ema"));
        System.out.println(ehPalindromo("Socorram-me subi no ônibus em Marrocos")); 
        System.out.println(ehPalindromo("Esta frase não é um palíndromo"));
        System.out.println(ehPalindromo("Able was I ere I saw Elba"));
        System.out.println(ehPalindromo("never odd or even"));
    }
}