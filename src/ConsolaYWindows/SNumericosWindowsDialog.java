package ConsolaYWindows;

import javax.swing.*;

public class SNumericosWindowsDialog {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        // es una ventana de dialogo con un input para ingresar datos




        int numeroDecimal = 0;
        try{
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,  "Error debe ingresar un numero entero");
            main(args); //vuelve a ejecutar el codigo desde arriba (metodo main)
            System.exit(0); //sale del catch para seguir ejecutando lo de debajo
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b110010000; // 0b interpreta que es binario
        //System.out.println("numeroBinario = " + numeroBinario);
        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0750; //para octal se antepone el 0 y ya lo interpreta
       // System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexa);

        int numeroHex = 0x1f4; //0x interpreta que es hexadecimal

        String mensaje = mensajeBinario;
        mensaje += "\n" +  mensajeOctal;
        mensaje += "\n" + mensajeHexa;
        JOptionPane.showMessageDialog(null, mensaje); //muetra un mensaje en pantalla con lo indicado



    }
}
