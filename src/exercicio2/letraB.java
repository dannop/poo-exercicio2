package exercicio2;

public class letraB {
    
   public static String pegaIniciais(String linha){
        String iniciais = "";
        int inicio = 0;
        int fim = linha.indexOf(" ", inicio);
        while (fim != -1) {
            iniciais += linha.substring(inicio, inicio + 1);
            inicio = fim + 1;
            fim = linha.indexOf(" ", inicio);
        }
       
        return iniciais;
   }
    
    public static void resultado(String linha){
        String iniciais = pegaIniciais(linha);
        System.out.print(linha + " => "  + iniciais);
    }
}
