package Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase string.. que tal!";

        Integer num = 7;

        boolean b1 = texto instanceof String; //valida que sea una instancia de ese tipo de objeto

        System.out.println("Texto es del tipo string? " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es el tipo Integer? " + b1);

        b1 = num instanceof Object;
        System.out.println("Num es del tipo Object" + b1);
        //todo objeto es del tipo Object

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es de tipo Number " + decimal);


    }
}
