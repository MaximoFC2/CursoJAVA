package Operadores;

public class PresedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = ((i + j + k) / 3d) * 10;
        System.out.println("promedio = " + promedio);

        double promedioMulti = ((i + j + k) / 3d) * 10;
        System.out.println("Multiplicado por 10 = " + promedioMulti);
    }
}
