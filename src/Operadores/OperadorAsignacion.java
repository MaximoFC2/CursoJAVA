package Operadores;

import javax.swing.*;

public class OperadorAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = 7;

        int suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        int resta =  i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i - j));

        int div = i / j; //division
        float div2 = (float) i / (float) j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        int resto = i % j;
        System.out.print("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println(" numero par = " + numero);

        }else {
            System.out.println(" numero impar = " + numero);
        }



    }
}
