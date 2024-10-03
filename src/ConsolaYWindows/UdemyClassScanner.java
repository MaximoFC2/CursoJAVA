package ConsolaYWindows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UdemyClassScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); //recibir datos del usuarios escritos en consola
        System.out.println("ingrese un numero entero");
//        String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try{
             numeroDecimal =scanner.nextInt(); //hace la misma conversion que
                                              // el parse solo que en caso de no ser un int tira una exepcion
                                             //Integer.parseInt(numeroStr);
        }catch (InputMismatchException e) { //InputMismatchException es la nueva exepcion que larga con nexint()
            System.out.println("Error debe ingresar un numero entero");
            main(args); //vuelve a ejecutar el codigo desde arriba (metodo main)
            System.exit(0); //sale del catch para seguir ejecutando lo de debajo
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = mensajeBinario;
        mensaje += "\n" +  mensajeOctal;
        mensaje += "\n" + mensajeHexa;
        System.out.println(mensaje);

        //a diferencia de JOptionPane que muestra en pantalla una ventana donde ingresar
        //Scanner le da la opcion al usuario de ingresar el dato por consola
        //y luego seguir mostrando resultados mediantes los soutv.



    }
}
