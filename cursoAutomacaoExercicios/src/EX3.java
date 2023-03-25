import javax.swing.JOptionPane;

public class EX3 {
    
    public static void main (String[] args){

        int numero01 = 10;
        int numero02 = 20;
        int numero03 = 30;
    
        System.out.println((numero01+numero02+numero03));

        int primeroNumero = 30;
        while(primeroNumero<=45){
            System.out.println("primeiroNumero:"+primeroNumero);
            primeroNumero=primeroNumero+1;
        }
        String sabado = JOptionPane.showInputDialog("Digite uma palavra");
    }

}
