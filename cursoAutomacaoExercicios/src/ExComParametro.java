public class ExComParametro {
    public static String texto (String primeiroTexto,String segundoTexto){
        
        return primeiroTexto+segundoTexto;
}
public static void main (String[]args){
    String primeiroTexto = "Primeiro texto leitura";
    String segundoTexto = "Segundo texto concatena";
System.out.println(texto(primeiroTexto, segundoTexto));
}

}