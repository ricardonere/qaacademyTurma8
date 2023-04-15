import javax.swing.JOptionPane;

public class ExExtraCasa {
    public static void main(String[]args){
// 3-Somar tres numeros e exibir o resultado
int numero1 = 10;
int numero2 = 20;
int numero3 = 30;

System.out.println((numero1+numero2+numero3));
//4-Exibir de 30 a 45
int primeiroNumero = 29;
int i = 1;
while(i<=16){
    int resultado = primeiroNumero+i;
    System.out.println(resultado);
    i=i+1;
}
int nu = 30;
while (nu<=45){
System.out.println("nu:"+nu);
nu=nu+1;
}
//5-Exibir de 100 a 0 (decescente)
int x = 100;
while(x>=0){
    System.out.println(x);
    x=x-1;
}
//6-Receber uma palavra do usuario, alterar o valor dela e exibir a variavel com o valor trocado
/*String sabado = JOptionPane.showImputDialog("Digite uma palavra");
String resultado01 = "alteracao";
sabado = resultado01;
Systen.out.println("Voce digitou: "+sabado);*/

String sabado = JOptionPane.showInputDialog("Digite uma palavra");
sabado = "Domingo";
System.out.println("Voce digitou:"+sabado);


    }
}
