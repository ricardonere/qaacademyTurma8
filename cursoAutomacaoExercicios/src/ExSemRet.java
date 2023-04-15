public class ExSemRet {
    public static void soma(){
        int num1 = 12;
        int num2 = 14;
        System.out.println(num1+num2);
    }
    public static int multiplicacao(){
        int num3 = 20;
        int num4 = 30;
    int resultado = num3 * num4;
        return resultado;
}
    public static String texto (){
        String oTexto = "Vai Estudar!";
        return oTexto;
}
public static void main(String[]args){
    ExSemRet somaResultado = new ExSemRet();
    soma();
    System.out.println(multiplicacao());
    System.out.println(texto());
}
}
