package exercicio2;

public class letraA {
    public static boolean checaVogal(char letra){
        //Convertendo em string pra poder verificar minusculo
        String palavra = String.valueOf(letra);
        palavra = palavra.toLowerCase();
        
        switch (palavra){
            case "a":
                return true;
            case "b":
                return true;
            case "c":
                return true;
            case "d":
                return true;
            case "e":
                return true;
        }
        return false;
    }
    
    public static int contaVogal(String palavra){
        int contador = 0;
        
        for (int i = 0; i < palavra.length(); i++){
            if (checaVogal(palavra.charAt(i))) contador++;
        };
        
        return contador;
    }
    
    public static void checaInicio(String palavra){
        String inicio = palavra.substring(0, 2);
        
        if (inicio.compareToIgnoreCase("UNI") == 0) System.out.print("Comeca com UNI \n");
        else System.out.print("Nao comeca com UNI \n");
    }
    
    public static void checaFim(String palavra){
        String fim = palavra.substring(palavra.length()-3, palavra.length()-1);
        
        if (fim.compareToIgnoreCase("RIO") == 0) System.out.print("Termina com RIO \n");
        else System.out.print("Nao termina com RIO \n");
    }
    
    public static void checaPalindromo(String palavra){
        String palavra_aux = "";
        
        for (int i = palavra.length()-1; i >= 0; i--){
            palavra_aux += String.valueOf(palavra.charAt(i));
        };
        
        if (palavra.compareToIgnoreCase(palavra_aux) == 0) System.out.print("E palindromo \n");
        else System.out.print("Nao e palindromo \n");
    }
    
    public static void resultado(String palavra){
        System.out.println("Numero de caracteres: " + palavra.length() + "\n");
        
        System.out.println("Palavra em Maisculo: " + palavra.toUpperCase() + "\n");
        
        int contador = contaVogal(palavra);
        System.out.println("Numero de vogais: " + contador + "\n");
        
        checaInicio(palavra);
        
        checaFim(palavra);
        
        checaPalindromo(palavra);
    }
}
