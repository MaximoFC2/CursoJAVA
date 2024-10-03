import java.util.Scanner;

public class LoginArreglos {
    private static String[] usernames;

    public static void main(String[] args) {


//        String[] usernames = new String[2];
//        String[] passwords = new String[2];

//        usernames[0] = "Maximo";
//        passwords[0] = "Mfide";
//
//        usernames[1] = "Admin";
//        passwords[1] = "12345";

        String[] usernames = {"Maximo" , "Admin"};
        String[] passwords = {"Mfide", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String u = scanner.next();

        System.out.println("Ingrese la contrasenia");

        String pass = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            // esAutentico = usernames[i].equalsIgnoreCase(u) && passwords[i].equals(pass)) ? true : esAutenticado
            //es una forma de utilizar el operador ternario es mejor el if con un break si es un arreglo grande
            if(usernames[i].equalsIgnoreCase(u) && passwords[i].equals(pass)){
                esAutenticado = true;
                break; //salir del for
            }else{
                System.out.println("Contrasenia o Ususario Incorrecto");
            }
        }


        //String Mensaje = esAutenticado ? "Bievenido Usuario: ".concat(u) : "lo lamento se requiere autenticacion"
        //lo mismo para reemplazar el if de deabajo
        if(esAutenticado){
            System.out.println("Bievenido Usuario: ".concat(u));
        } else {
            System.out.println("lo lamento se requiere autenticacion");
        }


    }
}
