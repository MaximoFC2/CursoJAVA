package StringsEjemplos;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis(); // tiempo inicial en milisegundos

        long fin = System.currentTimeMillis(); // timepo final en milisegundos

        for(int i = 0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n"); //hace 500 veces la concatenacion de a + b + salto de linea
            // y se la asigna a c en un tiempo de 2ms
           // c += a + b + "\n"; //es exactamente lo mismo solo que tarda 19ms
            sb.append(a).append(b).append("\n"); // hace exactamente lo mismo pero dura 0ms.
            // es la forma mas rapida y optimizada

        }

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());


























    }
}
