package Actividades;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("ingrese el nombre de su 1er familiar!!");
        String familiar1 = scanner.nextLine();
        String familiar1b = familiar1.toUpperCase().charAt(1) + "." + familiar1.substring(familiar1.length()-2);
        System.out.println("ingrese el nombre de su 2do familiar!!");
        String familiar2 = scanner.nextLine();
        String familiar2b = familiar2.toUpperCase().charAt(1) + "." + familiar2.substring(familiar2.length()-2);
        System.out.println("ingrese el nombre de su 3er familiar!!");
        String familiar3 = scanner.nextLine();
        String familiar3b = familiar3.toUpperCase().charAt(1) + "." + familiar3.substring(familiar3.length()-2);

        String nombres = familiar1 + " " + familiar2 + " " + familiar3;
        System.out.println("nombres = " + nombres);
        System.out.println("ahora modificaremos esos nombres");
        String resultado = familiar1b + "_" + familiar2b + "_" + familiar3b;
        System.out.println("resultado = " + resultado);




























    }
}
