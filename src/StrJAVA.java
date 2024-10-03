public class StrJAVA {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String ("Programacion JAVA");
        
        boolean esIgual = curso == curso2;

        System.out.println("esIgual = " + esIgual);
        //compara por el objeto y si fue creado de la misma forma

        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);
        //en este caso compara el texto o valor o atributo

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);
        //IgnoreCase ignora las mayusculas y minusculas


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
