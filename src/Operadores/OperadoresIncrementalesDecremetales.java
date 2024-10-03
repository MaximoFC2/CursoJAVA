package Operadores;

public class OperadoresIncrementalesDecremetales {
    public static void main(String[] args) {

        //pre incremento
        int i = 1;
        System.out.println("i = " + i);
        int j = ++i;

        System.out.println("j = " + j);

        //post incremento
        i = 2;
        System.out.println("i = " + i);
        j = i++;

        System.out.println("j = " + j);


        //pre decremento
        i = 3;
        System.out.println("i = " + i);
        j = --i;

        System.out.println("j = " + j);

        //post decremento
        i = 4;
        System.out.println("i = " + i);
        j = i--;

        System.out.println("j = " + j);








    }
}
