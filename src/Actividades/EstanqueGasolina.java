package Actividades;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cant de litros con la que cuenta su estanque");
        int capacidadActual = scanner.nextInt();

        if (capacidadActual == 70){
            System.out.println("Tanque lleno");
        }else if (capacidadActual >= 60 && capacidadActual < 70){
            System.out.println("Tanque casi Lleno");
        }else if(capacidadActual >= 40 && capacidadActual < 60){
            System.out.println("Estanque 3/4");
        }else if (capacidadActual >= 35 && capacidadActual < 40){
            System.out.println("Medio Tanque");
        }else if (capacidadActual >= 20 && capacidadActual < 35){
            System.out.println("Suficiente");
        }else{
            System.out.println("insuficiente");
        }
        









    }
}
