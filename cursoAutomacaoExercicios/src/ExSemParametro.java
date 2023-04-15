public class ExSemParametro {
    public static boolean somaValores(int num1, int num2){
        int resultado = num1+num2;
        if (resultado>100){
            return true;
        }
        else{
            return false;
        }
    }
        public static void main(String[]args){
            int num1 = 69;
            int num2 = 48; 
            System.out.println(somaValores(num1, num2));
        }
    }
       

