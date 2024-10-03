package Actividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre o descripcion de la factura");
        String descripcionNombre = scanner.nextLine();
        System.out.println("la Factura tiene el nombre de: " + descripcionNombre);


        Double precioP1 = 0.0;
        Double precioP2 = 0.0;
      try {
          System.out.println("ingrese el precio del primer Producto: ");
           precioP1 = scanner.nextDouble();

          System.out.println("ingrese el precio del segundo Producto: ");
           precioP2 = scanner.nextDouble();

      }catch (InputMismatchException e){
          System.out.println("Error debe ingresar un numero entero");
          main(args);
          System.exit(0);

      }


        System.out.println("se agregara un 19% de impuesto al total");


        Double sumaProductos = precioP1 + precioP2;
        Double valorImpuesto = (sumaProductos * 0.19);
        Double valorImpuestoSuma = (sumaProductos * 0.19) + sumaProductos;


        System.out.println("La factura producto: " + descripcionNombre + " tiene un total bruto de: " +
                sumaProductos + "\n con un impuesto de: " + valorImpuesto + "\n y el monto despues del impuesto es de: "
          + valorImpuestoSuma);




    }
}
