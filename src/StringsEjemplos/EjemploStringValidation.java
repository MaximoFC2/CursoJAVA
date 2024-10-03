package StringsEjemplos;

public class EjemploStringValidation {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "hola"; //si el contenido de curso es nulo asignar el valor de "hola"
        }

        boolean esVacio = curso.length() == 0; //valida que el string no este vacio

        boolean esVacio2 = curso.isEmpty();

        if(!esVacio) { //si no es vacio imprime esto en la pantalla
            System.out.println(curso.toUpperCase());
            System.out.println("bienvenido al curso".concat(curso));
        }

//        if(!esVacio) { //si no es vacio imprime esto en la pantalla   //ES OTRA ALTERNATIVA
//            System.out.println(curso.toUpperCase());
//            System.out.println("bienvenido al curso".concat(curso));
//        }

//        if(curso.isEmpty() == false) { //si no es vacio imprime esto en la pantalla //ES OTRA ALTERNATIVA
//            System.out.println(curso.toUpperCase());
//            System.out.println("bienvenido al curso".concat(curso));
//        }

        boolean esBlanco = curso.isBlank();

        if(!esBlanco) { //si no es vacio imprime esto en la pantalla
            System.out.println(curso.toUpperCase());
            System.out.println("bienvenido al curso".concat(curso));
        }















    }
}
