package Operadores;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 7 ? "es verdadero" : "es falso"; //? evalua la operacoon y retorna segun true o false
        //por ejemplo 7 es igual a 7 va a ser true entonce retorna el primer strin "es verdadero"
        System.out.println("variable = " + variable);



        String estado = "";
        double promedio = 0.0;

        double mate = 0.0;
        double ciencias = 0.0;
        double lenguas = 0.0;
        promedio = (mate + ciencias +  lenguas) / 3;

        Scanner s = new Scanner(System.in);

        System.out.println("ingrese su nota de matematica entre 2 y 7");
        mate = s.nextDouble();
        System.out.println("ingrese su nota de ciencias entre 2 y 7");
        ciencias = s.nextDouble();
        System.out.println("ingrese su nota de lenguas entre 2 y 7");
        lenguas = s.nextDouble();
        System.out.println("Su promedio sera calculado automaticamente");

        promedio = (mate + ciencias +  lenguas) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

//        if (promedio >= 5.49) { //es lo mismo que este if pero en una sola linea
//            estado = "aprobado";
//        }else{
//            estado = "Recahazado"
//        }

        //Numero MAYOR

        int max = 0;

        System.out.println("ingrese un numero");
        int num1 = s.nextInt();

        System.out.println("ingrese otro numero");
        int num2 = s.nextInt();

        System.out.println("ingrese otro numero");
        int num3 = s.nextInt();

        System.out.println("ingrese el ultimo numero");
        int num4 = s.nextInt();

        max = (num1 >num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        System.out.println("el numero mayor es: " + max);







    }
}
