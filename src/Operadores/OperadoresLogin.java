package Operadores;

import java.util.Scanner;

public class OperadoresLogin {
    public static void main(String[] args) {


        String username = "Maximo";
        String password = "Mfide";

        String user2 = "Admin";
        String pass2 = "adm123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String u = scanner.next();

        System.out.println("Ingrese la contrasenia");

        String pass = scanner.next();

        boolean esAutenticado = false;

        if(( username.equalsIgnoreCase(u) && password.equalsIgnoreCase(pass)) ||
                (user2.equalsIgnoreCase(u) && pass2.equalsIgnoreCase(pass)) ){
            esAutenticado = true;
        }else{
            System.out.println("Contrasenia o Ususario Incorrecto");
        }

        if(esAutenticado){
            System.out.println("Bievenido Usuario: ".concat(u));
        } else {
            System.out.println("lo lamento se requiere autenticacion");
        }


    }
}
