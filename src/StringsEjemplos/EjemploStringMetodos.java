package StringsEjemplos;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Maximo";

        System.out.println("nombre = " + nombre + nombre.length()); //longitud del string;
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //mayuscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());// minuscula
        System.out.println("nombre.equals(\"Maximo\") = " + nombre.equals("Maximo")); //que el valor sea el mismo
        System.out.println("nombre.equalsIgnoreCase(\"Maximo\") = " + nombre.equalsIgnoreCase("Maximo"));
        //ignora mayuscula y mi nuscula
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Andres")); //comparacion lexico grafico (orden)
        System.out.println("nombre.charAt() = " + nombre.charAt(2)); //capturar un caracter en especifico;
        System.out.println("nombre.substring() = " + nombre.substring(2, 4)); //obtener parte del string desde el numero de
        //la posicion en adelante por ejemplo con 1 agarra desde la a hasta la o y retorna aximo y puede colocarse final



        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        //cambia el caracter indicado primero por el caracter indicado segundo en este caso las "a" por "."
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a")); //retorna el numero de la
        //ubicacion del primer caracter indicado en este caso la primera vez que aparezca "a"
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a")); //lo mismo que
        //indexOf pero en este caso es el numero de la ultima vez que aparezca a. si el resultado es -1 es porque no
        //se encuentra ese caracter
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); //igual que indexOf solo
        //que el resultado es true o false
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); // valida si la
        // palabra inicia con los caracteres asignados. Retorna true o false
        System.out.println(" trabalenguas  = " +  trabalenguas );
        System.out.println(" trabalenguas ".trim()); //elimina los espacios





    }
}
