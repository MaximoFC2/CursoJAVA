package StringsEjemplos;

public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";
        
        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);

        curso.transform( (c) ->{
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso); //transforma el texto de curso en la concatenacion asignada
        
        String resultado2 = resultado.replace("a", "A"); //reemplaza la a minuscula por A mayuscula

        System.out.println("resultado2 = " + resultado2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
