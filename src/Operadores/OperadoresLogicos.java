package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k > l && m == true; // si todas las  condiciones se cumplen retorna true
        System.out.println("b1 = " + b1);
        
        boolean b2 = i == j || k > l || m == false; //1 de todas las condiciones debe ser correcta para retornar true
        System.out.println("b2 = " + b2);

        boolean b3 = true || true && false; //retornara true porque evalua primero el and y luego el or
        System.out.println("b3 = " + b3);
        boolean b4 = (true || true) && false; // retornara false porque obligamos a evaluar primero el or
        System.out.println("b4 = " + b4);
    }
}
