package StringsEjemplos;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {


        String archivo = "alguna_imagen.jpeg";
        int i = archivo.lastIndexOf("."); //obtiene el ultimo punto del string que es justo antes de la extension
        // del archivo
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo= " + archivo.substring(i + 1)); //retorna el string desde i que es el
        // indexOf antes mensionado y se le suma 1 para que no tome en cuenta el punto






    }
}
