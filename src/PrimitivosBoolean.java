public class PrimitivosBoolean {

    public static void main(String[] args) {
        boolean dataLogico = true;
        System.out.println("dataLogico = " + dataLogico);
        
        
        double d = 959959.54e-3; // 959.95954
        float f = 1.2345e2f; // 123.45
        
        
        dataLogico = (d < f);
        System.out.println("dataLogico = " + dataLogico);
        
        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
