package StringsEjemplos;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //convierte el string
        //en un arreglo de caracteres

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; //obtiene la longitud del arregla
        for(int i = 0; i < largo; i++){ //recorre el arreglo y muestra cada elemento uno debajo del otro letra x letra
            System.out.println("arreglo = " + arreglo[i]);
        }


        System.out.println("trabalenguas = " + trabalenguas.split("a")); //divide el string donde se encutran "a"
        //en este caso quedaria "tr" "b" "lengu" "s"
        String[] arreglo2 = trabalenguas.split("a"); //convierte en arreglo al string y separa las palabras
        int l = arreglo2.length;
        for(int j = 0; j < l ; j++){ //recorre el arreglo y muestra cada parte de este string que fue separado
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoAr = archivo.split("\\.");
        l = archivoAr.length;
        for (int i = 0; i< archivoAr.length; i++){
            System.out.println(archivoAr[i]);
        }

        System.out.println("extension = " + archivoAr[l - 1]);















    }
}
