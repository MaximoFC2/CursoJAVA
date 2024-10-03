package Actividades;

import java.util.Scanner;

public class OrdenarMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayor = 0;
        int menor = 0;

        System.out.println("Bienvenido");
        System.out.println("Coloque un Numero");
        int num1 = scanner.nextInt();
        System.out.println("Coloque un segundo Numero");
        int num2 = scanner.nextInt();


        mayor = (num1 > num2) ? num1 : num2;
        menor = (num1 < num2) ? num1 : num2;

        System.out.println("mayor = " + mayor + " menor = " + menor);
    }
}
